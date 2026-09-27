public class Q32CheckArmstrongNumber {

    static boolean isArmstrong(int num) {
        int original = num;
        int digits = String.valueOf(num).length();
        long sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (long) Math.pow(digit, digits);
            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(123));
    }
}

 /*
 HOW THIS FILE WORKS

 I store the original number, count its digits, extract each digit, raise it to the number of digits, and add the results. Finally, I compare the sum with the original number.

 IMPORTANT KEYWORDS

 Math.pow() -> Raises a number to a power.
String.valueOf() -> Converts a value to a String.
while -> Repeats while a condition is true.
% -> Gets the last digit using remainder.
== -> Compares primitive values.

 FLOW

 Original -> digit count -> extract last digit -> power -> sum -> compare with original
 */