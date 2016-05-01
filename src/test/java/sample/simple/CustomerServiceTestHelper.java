package sample.simple;

import com.google.common.collect.Lists;
import sample.simple.domain.contractor.Contractor;
import sample.simple.domain.contractor.Employer;
import sample.simple.domain.programming.ProgrammingLanguage;
import sample.simple.domain.programming.ProgrammingNature;
import sample.simple.util.Printer;

import java.util.List;
import java.util.function.Supplier;

public class CustomerServiceTestHelper {
    public static Supplier<ProgrammingLanguage> javaSupplier = () -> new ProgrammingLanguage("Java",
            ProgrammingNature.OBJECT_ORIENTED);
    public static Supplier<ProgrammingLanguage> cSupplier = () -> new ProgrammingLanguage("C++",
            ProgrammingNature.FUNCTIONAL);
    public static Supplier<ProgrammingLanguage> pythonSupplier = () -> new ProgrammingLanguage("Python",
            ProgrammingNature.SCRIPT);
    public static Supplier<ProgrammingLanguage> jsSupplier = () -> new ProgrammingLanguage("Java Script",
            ProgrammingNature.SCRIPT);
    public static Supplier<ProgrammingLanguage> cSharpSupplier = () -> new ProgrammingLanguage("C#",
            ProgrammingNature.OBJECT_ORIENTED);
    public static Supplier<Employer> tekSystemSupplier = () -> new Employer.Builder().employerName("TEKSystem").build();
    public static Supplier<List<Contractor>> contractorsSupplier = () -> {
        Supplier<Contractor.Builder> contractorSupplier = () -> new Contractor.Builder();
        Contractor contractor1 = contractorSupplier.get().firstName("Ming").lastName("Teng")
                .languages(Lists.newArrayList(javaSupplier.get(), pythonSupplier.get())).phoneNumber(3612321754L)
                .build();
        Contractor contractor2 = contractorSupplier.get().firstName("Mark").lastName("Blair").languages(
                Lists.newArrayList(cSharpSupplier.get(), cSupplier.get(), javaSupplier.get(), jsSupplier.get()))
                .phoneNumber(3435678910L).build();
        Contractor contractor3 = contractorSupplier.get().firstName("Allen").lastName("Bond")
                .languages(Lists.newArrayList(pythonSupplier.get(), javaSupplier.get())).phoneNumber(3612321754L)
                .build();
        return Lists.newArrayList(contractor1, contractor2, contractor3);
    };
    public static Printer<String> printer = System.out::println;
}