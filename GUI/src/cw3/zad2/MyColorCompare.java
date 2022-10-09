package cw3.zad2;

import java.util.Comparator;


public class MyColorCompare implements Comparator<MyColor>{
    private ColComponent colComponent;

    public MyColorCompare(ColComponent colComponent) {
        this.colComponent = colComponent;
    }

    @Override
    public int compare(MyColor o1, MyColor o2) {
        if (colComponent == ColComponent.RED) {
            return Integer.compare(o1.getRed(), o2.getRed());
        } else if (colComponent == ColComponent.BLUE) {
            return Integer.compare(o1.getBlue(), o2.getBlue());
        }
        return Integer.compare(o1.getGreen(), o2.getGreen());
    }

}
