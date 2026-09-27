import java.util.Arrays;

public class Q42FindSecondSmallestNumber {

    static int secondSmallest(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        return sorted[1];
    }

    public static void main(String[] args) {
        System.out.println(
            secondSmallest(new int[]{10, 5, 20, 3, 8})
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I copy the array, sort the copy in ascending order, and return the element at index 1, which is the second smallest value.

 IMPORTANT KEYWORDS

 Arrays.copyOf() -> Creates a copy of an array.
Arrays.sort() -> Sorts the array.
index 1 -> Second position because Java indexes start at 0.
return -> Returns the second smallest value.

 FLOW

 Original array -> copy -> sort ascending -> index 1 -> second smallest
 */