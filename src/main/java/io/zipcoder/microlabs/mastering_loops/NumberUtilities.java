package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i <= stop; i = i + 1) {
            if (i % 2 == 0){
                myString.append(i);
            }
        }
        return myString.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i <= stop; i = i + 1) {
            if (i % 2 == 1){
                myString.append(i);
            }
        }
        return myString.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i < stop; i = i + step) {
            if (i % 2 == 0){
                myString.append(i);
            }
        }
        return myString.toString();
    }

    public static String getRange(int start) {
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i <= start; i++) {
               myString.append(i);
            }

        return myString.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i < stop; i = i + 1) {
                myString.append(i);
            }
        return myString.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i < stop; i = i + step) {
            myString.append(i);
        }
        return myString.toString();}



    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder myString = new StringBuilder();

        for (int i = start; i < stop; i = i + step) {

                myString.append((int) Math.pow(i, exponent));
            }

        return myString.toString();

    }
}
