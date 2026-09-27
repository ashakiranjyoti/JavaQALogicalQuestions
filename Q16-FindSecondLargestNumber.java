public class Q16FindSecondLargestNumber {

    static Integer secondLargest(int[] arr) {
        Integer largest = null;
        Integer secondLargest = null;

        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest &&
                       (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{10, 5, 8, 20, 15}));
    }
}

 /*
 HOW THIS FILE WORKS

 I maintain two variables: the largest value and the second largest distinct value. When a new largest number appears, the old largest becomes second largest.

 IMPORTANT KEYWORDS

 Integer -> Wrapper class that can also hold null.
null -> Means no object/value is assigned.
for-each -> Iterates directly over array values.
&& -> Logical AND.

 FLOW

 Read each number -> update largest/second largest -> return second largest
 */