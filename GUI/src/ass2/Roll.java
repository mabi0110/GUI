package ass2;

import java.util.Iterator;

public class Roll implements Iterable<Integer> {
    private int counter = 0;
    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return num1 + num2 + num3 != 11 || num1 == 0 || num2 == 0 || num3 == 0;
            }

            @Override
            public Integer next() {
                if (counter % 3 == 0){
                    num1 = (int) ((Math.random() * 6) + 1);
                    counter++;
                    return num1;
                } else if (counter % 3 == 1){
                    num2 = (int) ((Math.random() * 6) + 1);
                    counter++;
                    return num2;
                } else {
                    num3 = (int) ((Math.random() * 6) + 1);
                    counter++;
                    return num3;
                }
            }
        };
    }
}
