import java.util.HashSet;

public class Q08RemoveDuplicatesUsingSet {

    public static void main(String[] args) {

        int[] numbers = {4, 8, 2, 4, 3, 9, 2};

        HashSet<Integer> unique = new HashSet<>();

        for (int num : numbers) {
            unique.add(num);
        }

        System.out.println(unique);
    }
}

/*
HOW THIS FILE WORKS

I use a HashSet because a Set stores only unique values.

When I add the array elements, duplicate values are automatically ignored.

IMPORTANT KEYWORDS

HashSet
-> Collection that stores unique values.

add()
-> Adds a value to the Set.

for-each
-> Loops directly through array values.

Integer
-> Wrapper class for int.

FLOW

Array -> add values to HashSet -> duplicates removed -> output
*/