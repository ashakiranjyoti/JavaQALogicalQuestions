public class Q34SumOfDigits {

    public static void main(String[] args) {

        int num = 1234;

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }

        System.out.println(sum);
    }
}

/*
HOW THIS FILE WORKS

I take one digit at a time from the number and add it to sum.

The loop continues until the number becomes 0.

IMPORTANT KEYWORDS

sum
-> Stores the total.

%
-> Gets the last digit.

while
-> Repeats until the condition becomes false.

/
-> Removes the last digit.

FLOW

1234 -> 4 -> 3 -> 2 -> 1 -> add -> 10
*/