package cw1.zad1;

public class Separ implements TwoStringsOper{

    private final String feeling;

    public Separ(String feeling) {
        this.feeling = feeling;
    }

    @Override
    public String apply(String napis1, String napis2) {
        return napis1 + feeling + napis2;
    }
}
