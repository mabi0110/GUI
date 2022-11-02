package cw5.zad2;

public class Student {
    private String firstName;
    private String groupNumber;
    private int points;

    public Student(String firstName, String groupNumber, int points) {
        this.firstName = firstName;
        this.groupNumber = groupNumber;
        this.points = points;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getTestPoints() {
        return points;
    }

    public void setTestPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return firstName + "(" + groupNumber + ")-" + points;
    }
}
