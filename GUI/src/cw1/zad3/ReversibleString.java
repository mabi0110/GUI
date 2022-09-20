package cw1.zad3;

public class ReversibleString implements Reversible{

    private String text;
    public ReversibleString(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Reversible reverse() {
        String reversedString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString += text.charAt(i);
        }
        this.text = reversedString;
        return this;
    }

    @Override
    public String toString() {
        return text;
    }
}
