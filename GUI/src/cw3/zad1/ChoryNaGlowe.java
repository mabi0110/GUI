package cw3.zad1;

public class ChoryNaGlowe extends Pacjent{
    public ChoryNaGlowe(String nazwisko) {
        super(nazwisko);
    }

    @Override
    public String choroba() {
        return "glowa";
    }

    @Override
    public String leczenie() {
        return "aspiryna";
    }
}
