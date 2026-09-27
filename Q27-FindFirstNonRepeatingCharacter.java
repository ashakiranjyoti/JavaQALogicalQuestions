import java.util.HashMap;

public class Q27FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "aabbcde";

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        for (char ch : str.toCharArray()) {

            if (frequency.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}

/*
HOW THIS FILE WORKS

First I count the frequency of each character.

Then I go through the original string again.

The first character whose frequency is 1 is the first non-repeating character.

IMPORTANT KEYWORDS

HashMap
-> Stores character and frequency.

get()
-> Gets a character's frequency.

toCharArray()
-> Converts String into a char array.

break
-> Stops the loop.

FLOW

Count frequency -> check original order -> frequency 1 -> first non-repeating
*/