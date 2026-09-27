public class Q15FindSmallestInArray {

    static int findSmallest(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(findSmallest(new int[]{5, 2, 8, 1, 9}));
    }
}

 /*
 HOW THIS FILE WORKS

 I assume the first element is the smallest. I compare every next element with smallest and update it whenever a smaller value is found.

 IMPORTANT KEYWORDS

 < -> Less-than comparison.
int[] -> Integer array.
for -> Repeats the comparison for every element.
return -> Returns the smallest value.

 FLOW

 First value as smallest -> compare -> update when smaller -> final smallest
 */