import java.util.HashMap;

public class Q17CountFrequencyOfArrayElements {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 3};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : numbers) {

            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
        }

        System.out.println(frequency);
    }
}

/*
HOW THIS FILE WORKS

I use a HashMap.

The number is stored as the key and its count is stored as the value.

If the number already exists, I increase its count.
Otherwise, I add it with count 1.

IMPORTANT KEYWORDS

HashMap
-> Stores key-value pairs.

containsKey()
-> Checks whether a key already exists.

put()
-> Adds or updates a key-value pair.

get()
-> Gets the value for a key.

FLOW

Number -> key exists? -> increase count / add 1
*/