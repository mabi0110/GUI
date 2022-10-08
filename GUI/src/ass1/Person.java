package ass1;

public class Person {

    protected String country;
    protected String firstname;
    protected String lastname;



    protected Person(String country, String firstname, String lastname) {
        this.country = country;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " (" + country + ")";
    }
}
