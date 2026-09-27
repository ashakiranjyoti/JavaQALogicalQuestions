public class Q01EvenOdd {

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isOdd(7));
        System.out.println(isEven(5));
    }
}

 /*
 HOW THIS FILE WORKS

 I check the remainder after dividing the number by 2. If the remainder is 0, the number is even. Otherwise, it is odd.

 IMPORTANT KEYWORDS

 static -> Defines a method that belongs to the class.
boolean -> Data type that stores true or false.
% -> Modulus operator that returns the remainder.
return -> Sends a value back from the method.
main() -> Starting point of a Java program.

 FLOW

 Number -> divide by 2 -> check remainder -> true/false
 */