import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q08RemoveDuplicatesUsingSet {

    static List<Integer> removeDuplicates(int[] arr) {
        Set<Integer> unique = new LinkedHashSet<>();

        for (int num : arr) {
            unique.add(num);
        }

        return new ArrayList<>(unique);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{4, 8, 2, 4, 3, 9, 2}));
    }
}

 /*
 HOW THIS FILE WORKS

 I store the array elements in a LinkedHashSet. A Set keeps only unique values, and LinkedHashSet also preserves insertion order. I then convert it back to a List for easy output.

 IMPORTANT KEYWORDS

 Set -> Collection that stores unique values.
LinkedHashSet -> Set that preserves insertion order.
add() -> Adds a value; duplicate values are ignored.
List -> Ordered collection of values.
import -> Makes Java classes available in the file.

 FLOW

 Array -> LinkedHashSet -> duplicate values removed -> List
 */