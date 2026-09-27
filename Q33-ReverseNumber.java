public class Q33ReverseNumber {

    static int reverseNumber(int num) {
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
    }
}

 /*
 HOW THIS FILE WORKS

 I repeatedly take the last digit using %, add it to the reversed number after shifting existing digits left by multiplying by 10, and remove the last digit by integer division.

 IMPORTANT KEYWORDS

 while -> Repeats until the number becomes 0.
% -> Extracts the last digit.
* 10 -> Shifts the existing digits left.
int division -> Removes the last digit from a positive integer.

 FLOW

 1234 -> 4 -> 43 -> 432 -> 4321
 */