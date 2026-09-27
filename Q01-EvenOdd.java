public class Q01EvenOdd {

    public static void main(String[] args) {

        int num = 5;

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

/*
 HOW THIS FILE WORKS

 I store a number in the num variable.

 Then I use an if-else condition to check the remainder when the number is divided by 2.

 If num % 2 == 0, the number is Even.
 Otherwise, the number is Odd.

 IMPORTANT KEYWORDS

 int
 -> Stores an integer value.

 if
 -> Executes the block when the condition is true.

 else
 -> Executes the block when the if condition is false.

 %
 -> Modulus operator. It returns the remainder.

 ==
 -> Compares two values.

 System.out.println()
 -> Prints the result on the console.

 main()
 -> Starting point of the Java program.

 FLOW

 Number
   ↓
 num % 2
   ↓
 Remainder == 0 ?
   ↓
 Yes → Even
 No  → Odd
*/
