import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q26FindDuplicateCharactersInString {

    static List<Character> findDuplicateCharacters(String str) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        List<Character> duplicates = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicateCharacters("programming"));
    }
}

 /*
 HOW THIS FILE WORKS

 I count the frequency of every character with a map. Then I inspect the map and collect characters whose frequency is greater than one.

 IMPORTANT KEYWORDS

 Map.Entry -> Represents one key-value pair in a map.
getValue() -> Gets the mapped value.
getKey() -> Gets the key.
toCharArray() -> Converts String to char array.
getOrDefault() -> Returns an existing value or a default value.

 FLOW

 String -> frequency map -> check frequency > 1 -> duplicate characters
 */