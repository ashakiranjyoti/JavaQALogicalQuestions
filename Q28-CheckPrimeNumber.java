public class Q28CheckPrimeNumber {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
    }
}

 /*
 HOW THIS FILE WORKS

 I first reject numbers less than or equal to 1. Then I check whether any value from 2 to num-1 divides the number exactly. If one does, the number is not prime.

 IMPORTANT KEYWORDS

 <= -> Less-than-or-equal comparison.
% -> Modulus operator.
boolean -> Stores true or false.
false/true -> Boolean literals.

 FLOW

 num <= 1? -> false -> check divisors -> divisor found? false : true
 */