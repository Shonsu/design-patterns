package pl.shonsu.patterns.creational.builder;

import java.time.LocalDate;

class PersonalInformation {
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private String city;

    private String mobileNumber;

    private PersonalInformation() {
        //restrict access to constructor
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                ", city='" + city + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public static FirstNameStep builder() {
        return new Builder();
    }

    private static class Builder implements FirstNameStep, LastNameStep, OptionalSteps {
        private PersonalInformation personalInformation;

        public Builder() {
            this.personalInformation = new PersonalInformation();
        }

        @Override
        public LastNameStep firstname(String firstname) {
            this.personalInformation.firstname = firstname;
            return this;
        }

        @Override
        public OptionalSteps lastName(String lastName) {
            this.personalInformation.lastname = lastName;
            return this;
        }

        @Override
        public OptionalSteps mobileNumber(String mobile) {
            this.personalInformation.mobileNumber = mobile;
            return this;
        }

        @Override
        public OptionalSteps city(String city) {
            this.personalInformation.city = city;
            return this;
        }

        @Override
        public OptionalSteps birthDate(LocalDate date) {
            personalInformation.birthDate = date;
            return this;
        }

        @Override
        public PersonalInformation build() {
            return this.personalInformation;
        }

    }

    public interface FirstNameStep {
        public LastNameStep firstname(final String firstname);
    }


    public interface LastNameStep {
        public OptionalSteps lastName(final String lastName);
    }

    public interface OptionalSteps {
        public OptionalSteps birthDate(final LocalDate date);

        public OptionalSteps mobileNumber(final String mobile);

        public OptionalSteps city(final String city);

        public PersonalInformation build();
    }
}
