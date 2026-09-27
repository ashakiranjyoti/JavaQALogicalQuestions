public class Q31SwapTwoNumbersWithoutThirdVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/*
HOW THIS FILE WORKS

I swap the two numbers using addition and subtraction.

No third variable is used.

IMPORTANT KEYWORDS

=
-> Assignment operator.

+
-> Addition.

-
-> Subtraction.

int
-> Stores an integer.

FLOW

a=10, b=20 -> a=30 -> b=10 -> a=20
*/