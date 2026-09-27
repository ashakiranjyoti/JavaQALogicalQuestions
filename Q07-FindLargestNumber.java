public class Q07FindLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {2, 6, 4, 1, 9};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println(largest);
    }
}

/*
HOW THIS FILE WORKS

I assume the first number is the largest.

Then I compare every next number with largest.
If a bigger number is found, I update largest.

IMPORTANT KEYWORDS

if
-> Checks a condition.

>
-> Greater-than operator.

int[]
-> Integer array.

largest
-> Stores the current largest value.

FLOW

First number -> compare -> bigger? -> update -> final largest
*/