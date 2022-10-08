package cw3.zad1;

public class Pacjent {
    private String nazwisko;
    private String choroba;
    private String leczenie;


    public Pacjent(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String nazwisko() {
        return nazwisko;
    }

    public String choroba() {
        return choroba;
    }

    public String leczenie() {
        return leczenie;
    }
}
