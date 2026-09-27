import java.util.HashMap;

public class Q40CountCharacterFrequency {

    public static void main(String[] args) {

        String str = "hello";

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        System.out.println(frequency);
    }
}

/*
HOW THIS FILE WORKS

I store each character as a key in the HashMap.

Its frequency is stored as the value.

If the character already exists, I increase its count.

IMPORTANT KEYWORDS

Character
-> Wrapper class for char.

HashMap
-> Stores key-value pairs.

containsKey()
-> Checks whether a key exists.

put()
-> Adds or updates a value.

FLOW

Character -> key exists? -> increase count / add 1
*/