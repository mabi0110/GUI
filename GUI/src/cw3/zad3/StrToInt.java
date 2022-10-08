package cw3.zad3;

public class StrToInt implements Transform<String, Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
