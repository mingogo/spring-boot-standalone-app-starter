package sample.simple.domain.contractor;

public class Employer {
    public Employer() {
    }

    private String employerName;

    public Employer(Builder builder) {
        this.employerName = builder.employerName;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public static class Builder {
        private String employerName;

        public Builder employerName(String em){
            this.employerName = em;
            return this;
        }
        public Employer build(){
            return new Employer(this);
        }
    }
}