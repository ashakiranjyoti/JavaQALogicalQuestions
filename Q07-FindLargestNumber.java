public class Q07FindLargestNumber {

    static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println(findLargest(new int[]{2, 6, 4, 1, 9}));
    }
}

 /*
 HOW THIS FILE WORKS

 I assume the first element is largest and compare each remaining value with it. Whenever I find a bigger value, I update largest.

 IMPORTANT KEYWORDS

 if -> Runs code only when a condition is true.
> -> Greater-than comparison operator.
int -> Integer data type.
return -> Returns the final largest value.

 FLOW

 Assume first value -> compare each next value -> update when bigger -> final largest
 */