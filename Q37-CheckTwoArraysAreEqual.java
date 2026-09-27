import java.util.Arrays;

public class Q37CheckTwoArraysAreEqual {

    static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(
            areArraysEqual(
                new int[]{1, 2, 3},
                new int[]{1, 2, 3}
            )
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I use Arrays.equals(), which checks that both arrays have the same length and matching elements at each position.

 IMPORTANT KEYWORDS

 Arrays -> Utility class for array operations.
equals() -> Compares array contents.
boolean -> Stores true or false.
return -> Sends the comparison result back.

 FLOW

 Array 1 -> Array 2 -> compare contents -> true/false
 */