package ass1;

public class Citizen extends Person implements Comparable<Citizen>{
    protected Citizen(String country, String firstname, String lastname) {
        super(country, firstname, lastname);
    }

    @Override
    public int compareTo(Citizen o) {
        int countryCompare = this.country.compareTo(o.country);
        if (countryCompare != 0){
            return countryCompare;
        }
        int lastnameCompare = this.lastname.compareTo(o.lastname);
        if (lastnameCompare != 0){
            return lastnameCompare;
        }
        return this.firstname.compareTo(o.firstname);
    }
}
