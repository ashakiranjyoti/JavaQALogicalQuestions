public class Q16FindSecondLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 20, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}

/*
HOW THIS FILE WORKS

I keep two variables: largest and secondLargest.

When I find a new largest number, the old largest becomes secondLargest.

IMPORTANT KEYWORDS

Integer.MIN_VALUE
-> Smallest possible int value.

for-each
-> Loops directly through array values.

else if
-> Checks another condition.

&&
-> Logical AND.

FLOW

Number -> compare with largest -> update largest / secondLargest
*/