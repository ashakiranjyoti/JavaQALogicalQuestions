public class Q06FindLargestNumberUsingMath {

    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 4, 9};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
        }

        System.out.println(largest);
    }
}

/*
HOW THIS FILE WORKS

I take the first element as the current largest value.

Then I compare each next number with it using Math.max().

IMPORTANT KEYWORDS

int[]
-> Integer array.

numbers.length
-> Gives the number of elements in the array.

Math.max()
-> Returns the larger value.

for
-> Loops through the array.

FLOW

First number -> compare with next number -> update largest -> repeat
*/