public class Q23FindLargestAndSmallestNumber {

    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 5, 30};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int num : numbers) {

            if (num < smallest) {
                smallest = num;
            }

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}

/*
HOW THIS FILE WORKS

I use the first element as both smallest and largest.

Then I compare every number and update the correct variable.

IMPORTANT KEYWORDS

for-each
-> Loops through array values.

smallest
-> Stores the smallest value.

largest
-> Stores the largest value.

if
-> Checks a condition.

FLOW

First value -> compare for smallest -> compare for largest -> update
*/