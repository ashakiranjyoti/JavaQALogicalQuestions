import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q18FindDuplicateElements {

    static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{1, 2, 3, 2, 4, 3}));
    }
}

 /*
 HOW THIS FILE WORKS

 I keep already-seen values in a Set. Set.add() returns false when the value already exists, so that value is added to the duplicate list.

 IMPORTANT KEYWORDS

 HashSet -> Stores unique values.
add() -> Adds a value and returns false for duplicates in a Set.
List -> Ordered collection.
boolean -> Stores true or false.

 FLOW

 Read number -> add to seen -> already present? -> add to duplicates
 */