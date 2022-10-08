package cw3.zad4;

public enum Country {
    PL, NL, DE;


    @Override
    public String toString() {
        if (name().equals("DE")) {
            return "Deutschland";
        } else if (name().equals("NL")){
            return "Nederland";
        }
        return "Polska";
    }
}
