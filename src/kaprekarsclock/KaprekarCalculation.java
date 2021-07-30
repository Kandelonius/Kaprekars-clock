package kaprekarsclock;

import java.util.*;

public class KaprekarCalculation {
    public static void KCalculate(int input) {
        int KCNumber = 0;
        int count = 0;
        int descending;
        int ascending;
        List<Integer> ints = new ArrayList<>();

        while(input != 6174) {
            descending = createDescending(input, ints);
            ascending = createAscending(ints);
            input = descending - ascending;
            count++;
        }
        System.out.println("Reached " + KCNumber + " in " + count + " iterations");
    }

    private static int createAscending(List<Integer> ints) {
        int sorted = 0;
        Collections.sort(ints);
        for (Integer anInt : ints) {
            sorted *= 10;
            sorted += anInt;
        }
        return sorted;
    }

    private static int createDescending(int input, List<Integer> ints) {
        int sorted = 0;

        for (int i = 0; i < 4; i++) {
            if (input >= 1) {
                ints.add(input % 10);
                input = (int) Math.floor((double) input / 10);
                if (input < 10) {
                    input = 0;
                } else {
                    input = (int) Math.floor((double) input / 10);
                }
            } else {
                ints.add(0);
            }
        }
        System.out.println("ints is " + ints);
        ints.sort(Collections.reverseOrder());
        for (Integer anInt : ints) {
            sorted *= 10;
            sorted += anInt;
        }
//        for (int i = 0; i < 4; i++) {
//            sorted *= 10;
//            sorted += ints[i];
//        }
        System.out.println(sorted);
        return sorted;
    }
}
