package sample.simple.util;


import sample.simple.domain.programming.ProgrammingLanguage;
import sample.simple.domain.programming.ProgrammingNature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestHelper {
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private List<ProgrammingLanguage> languages;
    private Map<String,ProgrammingNature> programmingNatureMap;

    public RestHelper(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.languages = builder.languages;
        this.programmingNatureMap = builder.map;
        programmingNatureMap.entrySet().stream().map(s -> " " + s.getKey().concat(" ").concat(s.getValue().toString()))
                .forEach(System.out::print);
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
        private List<ProgrammingLanguage> languages;
        private Map<String, ProgrammingNature> map = new HashMap();

        public Builder queryParameter(String var1, ProgrammingNature var2) {
            map.put(var1, var2);
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

        public RestHelper build() {
            return new RestHelper(this);
        }
    }
}