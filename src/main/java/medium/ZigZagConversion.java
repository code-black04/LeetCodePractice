package main.java.medium;

/**
 * {@link https://leetcode.com/problems/zigzag-conversion/description}
 */
public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {

        if (numRows == 1 | numRows >= s.length())
            return s;

        StringBuilder finalString = new StringBuilder();
        int itr = 0;

        while (itr < numRows) {
            for (int i = itr; i < s.length(); i = i + (numRows - 1) * 2) {
                finalString.append(s.charAt(i));

                int diagonalIndex = i + (numRows - itr - 1) * 2;
                if (itr > 0 && itr < numRows - 1 && diagonalIndex < s.length()) {
                    finalString.append(s.charAt(diagonalIndex));
                }
            }
            itr++;
        }

        return finalString.toString();
    }

}
