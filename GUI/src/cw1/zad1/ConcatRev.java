package cw1.zad1;

public class ConcatRev implements TwoStringsOper {
    @Override
    public String apply(String napis1, String napis2) {
        return napis2 + napis1;
    }
}
