package cw2.zad3;

public class LenFilter implements SFilter{
    private int minLen;

    public LenFilter(int minLen) {
        this.minLen = minLen;
    }

    @Override
    public boolean test(String s) {
        return s.length() > minLen;
    }
}
