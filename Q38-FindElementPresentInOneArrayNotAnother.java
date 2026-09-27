import java.util.ArrayList;
import java.util.List;

public class Q38FindElementPresentInOneArrayNotAnother {

    static List<Integer> findDifference(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            boolean found = false;

            for (int value : arr2) {
                if (num == value) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
            findDifference(
                new int[]{1, 2, 3, 4},
                new int[]{2, 4}
            )
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I check every element of the first array against the second array. If the value is never found in the second array, I add it to the result list.

 IMPORTANT KEYWORDS

 boolean -> Tracks whether a match was found.
break -> Stops searching after a match.
! -> Logical NOT.
List -> Stores the final elements.

 FLOW

 First array value -> search second array -> found? skip : add to result
 */