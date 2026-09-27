public class Q35CheckPalindromeNumber {

    static boolean isPalindromeNumber(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
        System.out.println(isPalindromeNumber(123));
    }
}

 /*
 HOW THIS FILE WORKS

 I reverse the number using the digit-extraction logic and compare the reversed number with the original value.

 IMPORTANT KEYWORDS

 original -> Keeps the input before modifying it.
reverse -> Stores the reversed number.
while -> Repeats the digit extraction.
== -> Compares numeric values.

 FLOW

 Original -> reverse digits -> compare original and reverse -> palindrome result
 */