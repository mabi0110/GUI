package cw2.zad3;

import java.util.Arrays;

public class StringFilter {
    public static void main (String[] args) {
        String[] arr = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(arr));
        String[] a1 = SFilter.filter(arr, new LenFilter(3));
        System.out.println(Arrays.toString(a1));
        SFilter sFilter = new SFilter() {
            @Override
            public boolean test(String s) {
                return s.charAt(0) >= 'A' && s.charAt(0) < 'D';
            }
        };
        String[] a2 = SFilter.filter(arr, sFilter);
        System.out.println(Arrays.toString(a2));
        String[] a3 = SFilter.filter(arr, (String s)-> s.charAt(0) > 'H' && s.charAt(0) <= 'Z');
        System.out.println(Arrays.toString(a3));
    }
}