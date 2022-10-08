package ass1;

public class Student extends Person implements Comparable<Student>{
    protected Student(String country, String firstname, String lastname) {
        super(country, firstname, lastname);
    }

    @Override
    public int compareTo(Student o) {
        int lastnameCompare = this.lastname.compareTo(o.lastname);
        if (lastnameCompare != 0){
            return lastnameCompare;
        }
        int firstnameCompare = this.firstname.compareTo(o.firstname);
        if (firstnameCompare != 0){
            return firstnameCompare;
        }
        return this.country.compareTo(o.country);
    }
}
