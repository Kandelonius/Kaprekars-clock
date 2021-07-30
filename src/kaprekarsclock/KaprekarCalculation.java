package kaprekarsclock;

import java.util.*;

public class KaprekarCalculation {
    public static void KCalculate(int input) {
//        int KCNumber = 0;
        int count = 0;
        int descending;
        int ascending;
        List<Integer> ints = new ArrayList<>();
        fillInts(input, ints);

        while(input != 6174) {
            descending = createDescending(ints);
            ascending = createAscending(ints);
            input = descending - ascending;
            fillInts(input, ints);
            count++;
        }
        System.out.println("Reached " + input + " in " + count + " iterations");
    }

    private static void fillInts(int input, List<Integer> ints) {
        ints.clear();
        for (int i = 0; i < 4; i++) {
            if (input >= 1) {
                ints.add(input % 10);
                if (input < 10) {
                    input = 0;
                } else {
                    input = input / 10;
                }
            } else {
                ints.add(0);
            }
        }
    }

    private static int createAscending(List<Integer> ints) {
        int sorted = 0;
        Collections.sort(ints);
//        System.out.println("ints is asc " + ints);
        for (Integer anInt : ints) {
            sorted *= 10;
            sorted += anInt;
        }
//        System.out.println("asc " +sorted);
        return sorted;
    }

    private static int createDescending(List<Integer> ints) {
        int sorted = 0;
        ints.sort(Collections.reverseOrder());
//        System.out.println("ints is dec " + ints);
        for (Integer anInt : ints) {
            sorted *= 10;
            sorted += anInt;
        }
//        System.out.println("dec " + sorted);
        return sorted;
    }
}
