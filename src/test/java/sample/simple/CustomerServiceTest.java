package sample.simple;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import org.junit.Test;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import static sample.simple.CustomerServiceTestHelper.printer;

public class CustomerServiceTest {
    private static String PETER = "Peter";
    private static String MING = "Ming";
    private static String BRUCE = "Bruce";
    @Test
    public void testCase() {
        Multimap<String, String> map = HashMultimap.create();
        map.put(MING, "31");
        map.put(MING, "32");
        map.put(MING, "33");
        map.put(PETER, "333");
        map.put(MING, "33");
        map.put(MING, "33");
        map.put(BRUCE, "100");
        map.put(BRUCE, "200");
        String applied = printSumOfMap.apply(map, MING);
        printer.print(applied);
    }

    private BiFunction<Multimap<String, String>, String,String> printSumOfMap = (map, name) -> {
        Preconditions.checkArgument(Objects.nonNull(name),"Name cannot be null");
        Preconditions.checkArgument(Objects.nonNull(map),"Name Map cannot be null");
        Stream<Integer> integerStream = Optional.ofNullable(map).orElseThrow(IllegalArgumentException::new).get(name)
                .stream().map(Integer::valueOf);
        Optional<Integer> reduce = integerStream.reduce(Integer::sum);
        return String.valueOf(reduce.orElse(999999));
    };
}