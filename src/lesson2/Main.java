package lesson2;

import java.util.regex.Pattern;

public class Main {
    public static final int ARRAY_SIZE = 4;
    public static void main(String[] args) {

        String[][] arr1 = {
                {"2", "1", "12", "3"},
                {"3", "3", "4", "5"},
                {"11", "3", "3"},
                {"1", "5", "12", "3"}
        };
        String[][] arr2 = {
                {"1", "5", "12", "3"},
                {"3", "3", "2", "5"},
                {"11", "3", "3", "Rambo"},
                {"1", "5", "12", "3"}
        };


        Summary(arr1);
        Summary(arr2);
    }

    static void Summary (String[][]  arr) {
        int sum = 0;
        try {
            checkArraySize(arr.length);
        } catch (MyArraySizeException e) {
//            e.printStackTrace();
            throw new RuntimeException("Array size problem", e);
        }
            for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].length);
            try {
                checkArraySize(arr[i].length);
            } catch (MyArraySizeException e) {
//                e.printStackTrace();
                throw new RuntimeException("Array size problem", e);
            }
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i].length != 4){
;
                    }else {
                        try {
                            checkSymbols(arr[i][j]);
                        } catch (MyArrayDataException e) {
                            throw new RuntimeException("Array data problem in arr[" + i + "]"+"["+j+"] element", e);
                        }
                    }
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        System.out.println("Summary is " + sum);
    }
    public static void checkArraySize (int length) throws MyArraySizeException {
    if (length != ARRAY_SIZE){
        throw new MyArraySizeException("Array size now " + length +  " Must be " + ARRAY_SIZE);
    }
        }
    public static void checkSymbols(String s) throws MyArrayDataException {
        if (Pattern.matches("\\d+", s) == false){
        throw new MyArrayDataException("This is not a number");
        }

    }

}
