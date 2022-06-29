package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder myString = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j < i; j++) {
                myString.append(String.format("*"));
            }
            if (i <= numberOfRows) {
                myString.append("*" + System.lineSeparator());
//                System.lineSeparator() is the same as "\n"
            }
        }
        return myString.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++)
            myString.append("*");
        return myString.toString();
    }

    public static String getSmallTriangle() {

        StringBuilder myString = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                myString.append(String.format("*"));
            }
            if (i <= 5) {
                myString.append("*" + System.lineSeparator());
//                return myString.toString();
            }
//            return myString.toString();
        }
        return myString.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder myString = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                myString.append(String.format("*"));
            }
            if (i <= 10) {
                myString.append("*" + System.lineSeparator());
//                return myString.toString();
            }
//            return myString.toString();
        }
        return myString.toString();
    }
}