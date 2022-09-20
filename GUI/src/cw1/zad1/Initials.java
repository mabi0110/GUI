package cw1.zad1;

public class Initials implements TwoStringsOper{
    @Override
    public String apply(String napis1, String napis2) {
        return "" + napis1.charAt(0) + napis2.charAt(0);
    }
}
