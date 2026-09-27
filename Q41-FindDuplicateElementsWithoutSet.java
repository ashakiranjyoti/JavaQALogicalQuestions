import java.util.ArrayList;
import java.util.List;

public class Q41FindDuplicateElementsWithoutSet {

    static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> unique = new ArrayList<>();

        for (int num : arr) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        System.out.println(
            removeDuplicates(new int[]{1, 2, 2, 3, 3, 4})
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I use an ArrayList to store unique values. Before adding each number, I check contains(). If the value is already in the list, I skip it.

 IMPORTANT KEYWORDS

 contains() -> Checks whether a collection already has a value.
ArrayList -> Resizable list.
if -> Conditional statement.
add() -> Adds a new value to the list.

 FLOW

 Number -> contains? -> skip if present -> otherwise add -> unique list
 */