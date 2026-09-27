import java.util.ArrayList;
import java.util.List;

public class Q36FindElementInTwoArrays {

    static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> common = new ArrayList<>();

        for (int num : arr1) {
            for (int value : arr2) {
                if (num == value) {
                    common.add(num);
                    break;
                }
            }
        }

        return common;
    }

    public static void main(String[] args) {
        System.out.println(
            findCommonElements(
                new int[]{1, 2, 3, 4},
                new int[]{3, 4, 5, 6}
            )
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I scan the first array and check each value against the second array. When a match is found, I add it to the common list and break the inner loop so the same first-array value is not added multiple times.

 IMPORTANT KEYWORDS

 break -> Stops the current loop.
List -> Ordered collection.
ArrayList -> Resizable list implementation.
== -> Compares integer primitive values.

 FLOW

 First array value -> search second array -> match? -> add -> next value
 */