package cw3.zad2;

import java.awt.*;

public class MyColor extends Color {
    public MyColor(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    public String toString() {
        return "(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")";
    }
}
