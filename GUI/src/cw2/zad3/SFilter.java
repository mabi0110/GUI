package cw2.zad3;

import java.util.Arrays;

@FunctionalInterface
interface SFilter {

    boolean test(String s);

    static String[] filter(String[] arr, SFilter filt) {
        String[] filtred = new String[0];
        int index = 0;
        for (String s : arr) {
            if(filt.test(s)){
                filtred = Arrays.copyOf(filtred, filtred.length + 1);
                filtred[index] = s;
                index++;
            }
        }
        return filtred;
    }

}
