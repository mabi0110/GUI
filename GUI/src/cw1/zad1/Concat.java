package cw1.zad1;

public class Concat implements TwoStringsOper {
    @Override
    public String apply(String napis1, String napis2) {
        return napis1 + napis2;
    }
}
