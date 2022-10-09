package cw3.zad2;

import java.awt.*;

public class MyColor extends Color implements Comparable<MyColor>{
    public MyColor(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    public String toString() {
        return "(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")";
    }

    @Override
    public int compareTo(MyColor o) {
        if (this.getRed() + this.getBlue() + this.getGreen() > o.getRed() + o.getBlue() + o.getGreen()) {
            return 1;
        } else if (this.getRed() + this.getBlue() + this.getGreen() < o.getRed() + o.getBlue() + o.getGreen()) {
            return -1;
        }
        return 0;
    }
}
