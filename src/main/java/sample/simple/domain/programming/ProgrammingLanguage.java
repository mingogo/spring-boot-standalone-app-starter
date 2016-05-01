package sample.simple.domain.programming;

public class ProgrammingLanguage {

    public ProgrammingLanguage(String name, ProgrammingNature nature) {
        this.name = name;
        this.nature = nature;
    }

    public ProgrammingLanguage() {
    }

    private String name;
    private ProgrammingNature nature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgrammingNature getNature() {
        return nature;
    }

    public void setNature(ProgrammingNature nature) {
        this.nature = nature;
    }
}
