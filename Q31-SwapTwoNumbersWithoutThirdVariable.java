public class Q31SwapTwoNumbersWithoutThirdVariable {

    public static void main(String[] args) {

        // Without using a third variable

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Without third variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Using a third variable

        int x = 10;
        int y = 20;
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("Using third variable:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

/*
HOW THIS FILE WORKS

This file shows both common ways to swap two numbers.

1. Without a third variable:
I use addition and subtraction to swap the values.

2. Using a third variable:
I store the first value in a temporary variable.
Then I assign the second value to the first variable.
Finally, I put the saved value into the second variable.

IMPORTANT KEYWORDS

int
-> Stores an integer value.

temp
-> Temporary variable used to hold a value during swapping.

=
-> Assignment operator.

+
-> Addition operator.

-
-> Subtraction operator.

FLOW

WITHOUT THIRD VARIABLE

a=10, b=20
   ↓
a=a+b
   ↓
b=a-b
   ↓
a=a-b
   ↓
a=20, b=10


USING THIRD VARIABLE

x=10, y=20
   ↓
temp=x
   ↓
x=y
   ↓
y=temp
   ↓
x=20, y=10
*/