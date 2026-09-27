import java.util.HashMap;
import java.util.Map;

public class Q17CountFrequencyOfArrayElements {

    static Map<Integer, Integer> countFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        return frequency;
    }

    public static void main(String[] args) {
        System.out.println(countFrequency(new int[]{1, 2, 2, 3, 3, 3}));
    }
}

 /*
 HOW THIS FILE WORKS

 I use a HashMap where the array value is the key and its frequency is the value. For every element, I get the current count and add one.

 IMPORTANT KEYWORDS

 Map -> Stores key-value pairs.
HashMap -> Map implementation used for fast key lookup.
put() -> Inserts or updates a key-value pair.
getOrDefault() -> Gets a value or returns a default when the key is absent.

 FLOW

 Array -> key lookup -> increase count -> frequency map
 */