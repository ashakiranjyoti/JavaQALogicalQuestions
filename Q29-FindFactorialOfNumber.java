public class Q29FindFactorialOfNumber {

    public static void main(String[] args) {

        int num = 5;

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}

/*
HOW THIS FILE WORKS

I start factorial with 1.

Then I multiply it by every number from 1 to num.

IMPORTANT KEYWORDS

factorial
-> Stores the running result.

*
-> Multiplication operator.

for
-> Repeats multiplication.

<=
-> Less-than-or-equal comparison.

FLOW

1 -> 1*2 -> 1*2*3 -> ... -> factorial
*/