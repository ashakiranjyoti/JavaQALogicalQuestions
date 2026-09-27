public class Q30FibonacciSeries {

    static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(a);

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        fibonacci(7);
    }
}

 /*
 HOW THIS FILE WORKS

 I keep the first two Fibonacci values in a and b. Each loop prints a, calculates the next value as a+b, and shifts the values forward.

 IMPORTANT KEYWORDS

 next -> Temporary variable for the next Fibonacci value.
= -> Assignment operator.
+ -> Addition operator.
for -> Controls how many values are printed.

 FLOW

 a=0,b=1 -> print a -> next=a+b -> shift a,b -> repeat
 */