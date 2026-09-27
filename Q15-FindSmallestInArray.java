public class Q15FindSmallestInArray {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 9};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println(smallest);
    }
}

/*
HOW THIS FILE WORKS

I assume the first number is the smallest.

Then I compare every next number with smallest.
If I find a smaller number, I update smallest.

IMPORTANT KEYWORDS

<
-> Less-than operator.

int[]
-> Integer array.

for
-> Repeats code.

smallest
-> Stores the current smallest value.

FLOW

First number -> compare -> smaller? -> update -> final smallest
*/