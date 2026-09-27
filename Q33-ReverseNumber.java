public class Q33ReverseNumber {

    public static void main(String[] args) {

        int num = 1234;

        int reverse = 0;

        while (num > 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        System.out.println(reverse);
    }
}

/*
HOW THIS FILE WORKS

I take the last digit using % 10.

Then I add that digit to the reverse number.

I remove the last digit from num using integer division.

IMPORTANT KEYWORDS

while
-> Repeats code while the condition is true.

% 10
-> Gets the last digit.

* 10
-> Shifts the existing digits to the left.

/
-> Removes the last digit for a positive integer.

FLOW

Number -> last digit -> add to reverse -> remove last digit -> repeat
*/