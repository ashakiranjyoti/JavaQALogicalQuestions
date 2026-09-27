public class Q19FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5};

        int n = numbers.length + 1;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        int missing = total - sum;

        System.out.println(missing);
    }
}

/*
HOW THIS FILE WORKS

I calculate the expected sum from 1 to n.

Then I calculate the actual sum of the array.

The difference between them is the missing number.

IMPORTANT KEYWORDS

length
-> Number of elements.

for-each
-> Loops through values.

sum
-> Stores the running total.

Formula
-> n * (n + 1) / 2 gives the sum from 1 to n.

FLOW

Expected sum -> actual sum -> subtract -> missing number
*/