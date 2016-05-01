package sample.simple;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import org.junit.Test;
import sample.simple.domain.contractor.Contractor;
import sample.simple.domain.contractor.Employer;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Supplier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.stringContainsInOrder;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static sample.simple.CustomerServiceTestHelper.*;

public class JacksonTest {
    private Contractor ming = new Contractor.Builder().firstName("Ming").lastName("Teng")
            .languages(Lists.newArrayList(javaSupplier.get(), pythonSupplier.get())).phoneNumber(3612321754L)
            .employer(tekSystemSupplier.get())
            .build();
    private Supplier<ObjectMapper> omSupplier = () -> new ObjectMapper();

    @Test
    public void testCase() throws IOException {
        assertThat(ming.getEmployer(), isA(Employer.class));
        String asString = omSupplier.get().writeValueAsString(ming);
        printer.print(omSupplier.get().writerWithDefaultPrettyPrinter().writeValueAsString(ming));
        assertThat(asString, stringContainsInOrder(Arrays.asList("employer")));
        Contractor contractor = omSupplier.get().readValue(asString, Contractor.class);
        assertThat(contractor.getEmployer().getEmployerName(), is(tekSystemSupplier.get().getEmployerName()));
    }
}