package main.java.easy;

/**
 * {@link https://leetcode.com/problems/add-binary/descriptio}
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        StringBuffer string = new StringBuffer();

        if (a.length() == 0 && b.length() != 0) return b;
        if (a.length() != 0 && b.length() == 0) return a;
        if (a.length() == 0 && b.length() == 0) return "";

        for (int i = a.length() - 1, j = b.length() - 1, carry = 0;
             i >= 0 || j >= 0 || carry == 1 ; i--, j--) {

            char c1 = (i >= 0 ? a.charAt(i) : '0');
            char c2 = (j >= 0 ? b.charAt(j) : '0');

            int sum = c1 + c2 + carry;

            if (sum > 97) {
                string.append(sum - 98);
                carry = 1;
            } else {
                string.append(sum - 96);
                carry = 0;
            }
        }
    return string.reverse().toString();
    }
}
