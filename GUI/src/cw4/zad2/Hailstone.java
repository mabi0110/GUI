package cw4.zad2;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer> {

    private int a0;
    public Hailstone(int a0) {
        assert (a0 > 1);
        this.a0 = a0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return a0 != 1;
            }

            @Override
            public Integer next() {
                if (a0 % 2 == 0){
                    a0 = a0 / 2;
                } else {
                    a0 = (3 * a0) + 1;
                }
                return a0;
            }
        };
    }
}
