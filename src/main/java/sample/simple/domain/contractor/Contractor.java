package sample.simple.domain.contractor;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import sample.simple.domain.programming.ProgrammingLanguage;

import java.util.List;

public class Contractor {
    private String firstName;
    private String lastName;
    @JsonUnwrapped
    private Employer employer;
    private Long phoneNumber;
    private List<ProgrammingLanguage> languages;

    public Contractor() {
    }

    public Contractor(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.languages = builder.languages;
        this.employer = builder.employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<ProgrammingLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(List<ProgrammingLanguage> languages) {
        this.languages = languages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Long phoneNumber;
        private Employer employer;
        private List<ProgrammingLanguage> languages;

        public Builder employer(Employer em) {
            this.employer = em;
            return this;
        }

        public Builder firstName(String fn) {
            this.firstName = fn;
            return this;
        }

        public Builder lastName(String ln) {
            this.lastName = ln;
            return this;
        }

        public Builder phoneNumber(Long pn) {
            this.phoneNumber = pn;
            return this;
        }

        public Builder languages(List<ProgrammingLanguage> ls) {
            this.languages = ls;
            return this;
        }

        public Contractor build() {
            return new Contractor(this);
        }
    }
}