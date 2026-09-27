public class Q30FibonacciSeries {

    public static void main(String[] args) {

        int n = 7;

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {

            System.out.println(a);

            int next = a + b;

            a = b;
            b = next;
        }
    }
}

/*
HOW THIS FILE WORKS

I keep the first two Fibonacci values in a and b.

I print a, calculate the next value using a + b, and then move the values forward.

IMPORTANT KEYWORDS

next
-> Stores the next Fibonacci number.

=
-> Assignment operator.

+
-> Addition operator.

for
-> Repeats the process.

FLOW

a=0, b=1 -> print a -> next=a+b -> shift values -> repeat
*/