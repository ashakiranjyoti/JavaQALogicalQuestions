import java.util.HashMap;
import java.util.Map;

public class Q40CountCharacterFrequency {

    static Map<Character, Integer> countCharacterFrequency(String str) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        return frequency;
    }

    public static void main(String[] args) {
        System.out.println(countCharacterFrequency("hello"));
    }
}

 /*
 HOW THIS FILE WORKS

 I use a map where each character is a key and the number of times it appears is the value.

 IMPORTANT KEYWORDS

 Map -> Key-value collection.
HashMap -> Stores mappings.
Character -> Wrapper type for char.
getOrDefault() -> Reads current count or uses 0.

 FLOW

 Character -> lookup frequency -> increment -> final frequency map
 */