public class Q19FindMissingNumberInArray {

    static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1, 2, 3, 5}));
    }
}

 /*
 HOW THIS FILE WORKS

 I calculate the expected sum from 1 to n using the arithmetic-series formula. Then I subtract the actual array sum. The difference is the missing number.

 IMPORTANT KEYWORDS

 Formula -> n * (n + 1) / 2 gives sum from 1 to n.
for-each -> Iterates through array values.
sum += num -> Adds each number to sum.
return -> Returns the difference.

 FLOW

 Expected sum -> actual sum -> subtract -> missing number
 */