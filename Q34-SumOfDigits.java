public class Q34SumOfDigits {

    static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
}

 /*
 HOW THIS FILE WORKS

 I extract one digit at a time with the modulus operator and add it to sum. Integer division removes the processed digit.

 IMPORTANT KEYWORDS

 % -> Returns the last digit as remainder.
+= -> Adds a value to the existing variable.
while -> Repeats while condition is true.
/ -> Integer division for int values.

 FLOW

 1234 -> 4 -> 3 -> 2 -> 1 -> add digits -> 10
 */