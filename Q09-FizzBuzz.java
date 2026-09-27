public class Q09FizzBuzz {

    static void fizzBuzz() {
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

    public static void main(String[] args) {
        fizzBuzz();
    }
}

 /*
 HOW THIS FILE WORKS

 I loop from 1 to 100 and check divisibility using %. I check the combined condition first so multiples of both 3 and 5 print FizzBuzz.

 IMPORTANT KEYWORDS

 % -> Returns remainder.
&& -> Logical AND.
else if -> Checks another condition when the previous one is false.
System.out.println() -> Prints output to the console.

 FLOW

 1 to 100 -> divisible by 3 and 5? -> FizzBuzz / 3? -> Fizz / 5? -> Buzz / otherwise number
 */