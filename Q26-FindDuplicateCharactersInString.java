import java.util.HashMap;

public class Q26FindDuplicateCharactersInString {

    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        System.out.println("Duplicate characters:");

        for (char ch : frequency.keySet()) {

            if (frequency.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }
}

/*
HOW THIS FILE WORKS

I first count the frequency of every character using a HashMap.

Then I check the map again.
If a character has a count greater than 1, it is a duplicate.

IMPORTANT KEYWORDS

Character
-> Wrapper class for char.

keySet()
-> Returns all keys from the map.

containsKey()
-> Checks whether the character already exists.

get()
-> Gets the stored count.

FLOW

String -> count characters -> frequency > 1 -> duplicate character
*/