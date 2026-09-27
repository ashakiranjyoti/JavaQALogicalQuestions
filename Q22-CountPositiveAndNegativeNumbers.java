import java.util.HashMap;
import java.util.Map;

public class Q22CountPositiveAndNegativeNumbers {

    static Map<String, Integer> countPositiveNegative(int[] arr) {
        int positive = 0;
        int negative = 0;

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("positive", positive);
        result.put("negative", negative);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
            countPositiveNegative(new int[]{10, -5, 20, -8, 15})
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I use two counters. Positive numbers increase the positive counter, and negative numbers increase the negative counter. Zero is ignored, matching the original logic.

 IMPORTANT KEYWORDS

 Map -> Key-value collection.
put() -> Stores a key-value pair.
else if -> Checks another condition when the first condition is false.
> and < -> Numeric comparisons.

 FLOW

 Read each number -> positive? count positive -> negative? count negative -> return both
 */