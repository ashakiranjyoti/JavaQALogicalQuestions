import java.util.HashMap;
import java.util.Map;

public class Q27FindFirstNonRepeatingCharacter {

    static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabbcde"));
    }
}

 /*
 HOW THIS FILE WORKS

 I make one pass to count character frequency. Then I traverse the original string again so the first character with frequency 1 is returned.

 IMPORTANT KEYWORDS

 Character -> Wrapper class for char.
get() -> Retrieves a value from a map.
return null -> Returns no character when every character repeats.
toCharArray() -> Converts String to character array.

 FLOW

 First pass -> frequency count -> second pass in original order -> first count 1
 */