package main.java.medium;

import java.util.Arrays;

public class IntegerToRoman {

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        StringBuilder romanNumber = new StringBuilder();

        int[] predefinedValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] predefinedSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < predefinedValues.length; i++) {
            while (num >= predefinedValues[i]) {
                romanNumber.append(predefinedSymbols[i]);
                num -= predefinedValues[i];
            }
        }
        return romanNumber.toString();
    }
}
