package kaprekarsclock;

import java.util.*;

/**
 * A class to take in a number from the time and converts it into a list of numbers, then
 * runs it through the Kaprekar algorithm to arrive at the number 6174.
 * The algorithm is:
 * take any number from 1 - 9998 and sort it in descending order(minuend) then sort it in
 * ascending order(subtrahend) and subtract the two numbers. After that take the resulting
 * number and repeat the process until you reach the number 6174. Once you reach 6174 repeating
 * the process will simply result in 6174 and never stray from that number meaning that is the
 * final possible outcome.
 *
 * **This will work with any number from 1-9998 except any 4 digit number where all of the
 * numbers are the same i.e. 1111 or 7777. for numbers less than 1000 a '0' is added to achieve
 * a 4-digit number.
 */
public class KaprekarCalculation {

    public KaprekarCalculation(int input) {
        KCalculate(input);
    }

    private int count = 0; // iterations
    public KaprekarCalculation(String time) {
        int intTime = Integer.parseInt(time);
        KCalculate(intTime);
    }

    private void KCalculate(int input) {

        int descending;
        int ascending;
        List<Integer> ints = new ArrayList<>();



        fillInts(input, ints);

        while(input != 6174) {
            descending = createDescending(ints); // minuend
            ascending = createAscending(ints); // subtrahend
            input = descending - ascending; // difference
            fillInts(input, ints);
            count++;
        }
        System.out.println("Reached " + input + " in " + count + " iterations");
    }

    /**
     * takes the input the user sends and loads it into a list of 4 individual numbers 0 - 9
     * to later be converted into a 4-digit number.
     *
     * @param input
     * @param ints
     */
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

    /**
     * Returns the number in descending order that will be the minuend of the subtraction part of
     * the algorithm.
     *
     * @param ints
     * @return
     */
    private static int createDescending(List<Integer> ints) {
        int sorted = 0;
        ints.sort(Collections.reverseOrder());
        for (Integer anInt : ints) {
            sorted *= 10;
            sorted += anInt;
        }
        return sorted;
    }

    /**
     * Returns the number in ascending order that will be the subtrahend of the subtraction part of
     * the algorithm.
     *
     * @param ints
     * @return
     */
    private static int createAscending(List<Integer> ints) {
        int sorted = 0;
        Collections.sort(ints);
        for (Integer anInt : ints) {
            sorted *= 10;
            sorted += anInt;
        }
        return sorted;
    }

    public int getCount() {
        return count;
    }
}
