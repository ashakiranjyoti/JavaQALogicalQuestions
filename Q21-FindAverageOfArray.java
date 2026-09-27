public class Q21FindAverageOfArray {

    static double findAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{10, 20, 30, 40}));
    }
}

 /*
 HOW THIS FILE WORKS

 I first calculate the sum and then divide it by the number of elements. I cast sum to double so the division can produce a decimal result when needed.

 IMPORTANT KEYWORDS

 double -> Stores decimal values.
(double) -> Type casting from int to double.
arr.length -> Number of array elements.
for-each -> Iterates through the array.

 FLOW

 Sum -> divide by arr.length -> average
 */