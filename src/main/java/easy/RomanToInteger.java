package main.java.easy;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInteger("MM"));
    }

    public static int romanToInteger(String string) {
        int integerResult = 0;
        int i = 0;

        int[] predefinedValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] predefinedSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        while (i < string.length()) {
            for (int j = 0; j < predefinedSymbols.length; j++) {
                if (i + predefinedSymbols[j].length() <= string.length() &&
                string.substring(i, i + predefinedSymbols[j].length()).equals(predefinedSymbols[j])) {
                    integerResult += predefinedValues[j];
                    i = i+ predefinedSymbols[j].length();
                    break;
                }
            }
        }
        return integerResult;
    }
}
