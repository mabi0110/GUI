package cw1.zad3;

public class ReversibleDouble implements Reversible{

    private double number;
    public ReversibleDouble(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public Reversible reverse() {
        this.number = 1 / number;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
