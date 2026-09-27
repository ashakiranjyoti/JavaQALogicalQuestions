import java.util.ArrayList;

public class Q41FindDuplicateElementsWithoutSet {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 4};

        ArrayList<Integer> unique = new ArrayList<>();

        for (int num : numbers) {

            if (!unique.contains(num)) {
                unique.add(num);
            }
        }

        System.out.println(unique);
    }
}

/*
HOW THIS FILE WORKS

I do not use Set.

I keep unique values inside an ArrayList.

Before adding a number, I check whether it is already present.

IMPORTANT KEYWORDS

ArrayList
-> Resizable list.

contains()
-> Checks whether a value exists in the list.

add()
-> Adds a value.

for-each
-> Loops through array values.

FLOW

Number -> already in list? -> yes: skip -> no: add
*/