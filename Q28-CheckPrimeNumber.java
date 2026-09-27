public class Q28CheckPrimeNumber {

    public static void main(String[] args) {

        int num = 7;
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

/*
HOW THIS FILE WORKS

I assume the number is prime.

Numbers less than or equal to 1 are not prime.

Then I check whether any number from 2 to num-1 divides it completely.

If a divisor is found, it is not prime.

IMPORTANT KEYWORDS

boolean
-> Stores true or false.

%
-> Returns the remainder.

break
-> Stops the loop.

<=
-> Less-than-or-equal operator.

FLOW

Number -> <=1? -> not prime -> otherwise check divisors -> result
*/