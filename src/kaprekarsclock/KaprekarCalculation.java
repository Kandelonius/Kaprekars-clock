package kaprekarsclock;

import java.util.*;

public class KaprekarCalculation {
    public static int KCalculate(int input) {
        int count = 0;
        int descending;
        int ascending;

        while(input != 6174 || count < 10) {
            descending = createDescending(input);
            count++;
        }

        return count;
    }
    private static int createDescending(int input) {
        int sorted = 0;
        Integer ints[] = new Integer[4];
        for (int i = 0; i < 4; i++) {
            if (input >= 1) {
                ints[i] = (input % 10);
                if (input < 10) {
                    input = 0;
                } else {
                    input = input / 10;
                }
            } else {
                ints[i] = 0;
            }
        }
        Arrays.sort(ints, Collections.reverseOrder());
        return sorted;
    }
}
