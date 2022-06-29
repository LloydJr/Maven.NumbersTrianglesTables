package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder myString = new StringBuilder();
        for (int i = 1; i <=  5; i++) {
            for (int j = 1; j <= 5; j++) {
                myString.append(String.format("%3d |", j * i));
            }
            if (i <= 5){
                myString.append("\n");
            }
        }
        return myString.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder myString = new StringBuilder();
        for (int i = 1; i <=  10; i++) {
            for (int j = 1; j <= 10; j++) {
                myString.append(String.format("%3d |", j * i));
            }
            if (i <= 10){
                myString.append("\n");
            }
        }
        return myString.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder myString = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
//            table.append(String.format("%3d |", i * i)/* + "\n"*/); No need to print table twice, only necessary in the nested for loop
            for (int j = 1; j <= tableSize; j++) {
                myString.append(String.format("%3d |", j * i));
            }
            if (i <= tableSize) {
                myString.append("\n");
            }
        }  return myString.toString();
    }
}