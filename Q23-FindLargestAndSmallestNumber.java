import java.util.HashMap;
import java.util.Map;

public class Q23FindLargestAndSmallestNumber {

    static Map<String, Integer> findMinMax(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }

            if (num > largest) {
                largest = num;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("smallest", smallest);
        result.put("largest", largest);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
            findMinMax(new int[]{25, 10, 45, 5, 30})
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I initialize both smallest and largest with the first element. Every value is compared with both variables and the matching variable is updated.

 IMPORTANT KEYWORDS

 HashMap -> Key-value map implementation.
smallest/largest -> Track current boundaries.
if -> Conditional statement.
put() -> Adds the final values to the result map.

 FLOW

 First value -> compare for smallest -> compare for largest -> update -> final min/max
 */