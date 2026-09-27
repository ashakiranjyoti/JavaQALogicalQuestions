public class Q09FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

/*
HOW THIS FILE WORKS

I loop from 1 to 100.

I first check numbers divisible by both 3 and 5.
Then I check 3, then 5.
Otherwise I print the number.

IMPORTANT KEYWORDS

%
-> Returns the remainder.

&&
-> Logical AND.

else if
-> Checks another condition.

<=
-> Less-than-or-equal operator.

FLOW

1 to 100 -> check 3 and 5 -> FizzBuzz / Fizz / Buzz / number
*/