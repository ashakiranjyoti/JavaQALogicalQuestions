public class Q29FindFactorialOfNumber {

    static long factorial(int num) {
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

 /*
 HOW THIS FILE WORKS

 I start the result at 1 and multiply it by every number from 1 through the input value.

 IMPORTANT KEYWORDS

 long -> Integer type with a larger range than int.
for -> Repeats multiplication.
* -> Multiplication operator.
result -> Stores the running factorial value.

 FLOW

 result=1 -> multiply by 1 -> 2 -> ... -> num -> factorial
 */