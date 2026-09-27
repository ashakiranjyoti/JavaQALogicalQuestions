public class Q20SumOfArrayElements {

    static int findSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSum(new int[]{10, 20, 30, 40}));
    }
}

 /*
 HOW THIS FILE WORKS

 I initialize sum to zero and add every array element to it. Finally, I return the accumulated total.

 IMPORTANT KEYWORDS

 for-each -> Iterates through values directly.
sum += num -> Adds current number to sum.
int -> Integer data type.

 FLOW

 sum=0 -> add each element -> return total
 */