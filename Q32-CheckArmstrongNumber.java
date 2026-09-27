public class Q32CheckArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        int original = num;

        int digits = String.valueOf(num).length();

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + (int) Math.pow(digit, digits);

            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

/*
HOW THIS FILE WORKS

I store the original number because num changes during the loop.

I find the number of digits.
Then I take each digit, raise it to the number of digits, and add the result.

Finally, I compare the sum with the original number.

IMPORTANT KEYWORDS

Math.pow()
-> Raises a number to a power.

String.valueOf()
-> Converts a value into a String.

while
-> Repeats while a condition is true.

/
-> Integer division removes the last digit.

FLOW

Original -> count digits -> take digit -> power -> sum -> compare
*/