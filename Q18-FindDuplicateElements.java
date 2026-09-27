import java.util.HashSet;

public class Q18FindDuplicateElements {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 3};

        HashSet<Integer> seen = new HashSet<>();

        for (int num : numbers) {

            if (seen.contains(num)) {
                System.out.println(num);
            } else {
                seen.add(num);
            }
        }
    }
}

/*
HOW THIS FILE WORKS

I use a HashSet to store numbers that I have already seen.

If a number is already in the Set, it is a duplicate.

IMPORTANT KEYWORDS

HashSet
-> Stores unique values.

contains()
-> Checks whether a value exists.

add()
-> Adds a value.

for-each
-> Loops through array values.

FLOW

Number -> already in Set? -> yes: duplicate -> no: add to Set
*/