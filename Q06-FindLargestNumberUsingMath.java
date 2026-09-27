public class Q06FindLargestNumberUsingMath {

    static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println(findLargest(new int[]{3, 7, 2, 4, 9}));
    }
}

 /*
 HOW THIS FILE WORKS

 I keep the first element as the current largest value. For every next element, Math.max() returns the bigger of the current largest and that element.

 IMPORTANT KEYWORDS

 Math.max() -> Returns the larger of two values.
int[] -> Integer array.
for -> Loops through the array.
arr.length -> Number of elements in the array.

 FLOW

 First value -> Math.max(current largest, next value) -> update largest -> continue
 */