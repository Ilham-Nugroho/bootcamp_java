package id.co.mandiri.bankapp.java8;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String country;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public Person createPerson() {
        return new Person(firstName, lastName, email, city, country);
    }


}