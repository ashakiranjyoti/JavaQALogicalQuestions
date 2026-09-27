public class Q31SwapTwoNumbersWithoutThirdVariable {

    static int[] swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] result = swapNumbers(10, 20);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

 /*
 HOW THIS FILE WORKS

 I use arithmetic to swap the two values without introducing another variable. After a=a+b, the original values can be recovered with subtraction.

 IMPORTANT KEYWORDS

 Assignment -> Updates a variable.
+ and - -> Arithmetic operators.
new int[] -> Creates an integer array.
return -> Returns the swapped values.

 FLOW

 a=10,b=20 -> a=30 -> b=10 -> a=20 -> swapped
 */