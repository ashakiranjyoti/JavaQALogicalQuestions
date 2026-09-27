import java.util.Arrays;

public class Q42FindSecondSmallestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 3, 8};

        Arrays.sort(numbers);

        int secondSmallest = numbers[1];

        System.out.println(secondSmallest);
    }
}

/*
HOW THIS FILE WORKS

I sort the array in ascending order.

After sorting, index 0 is the smallest and index 1 is the second smallest.

IMPORTANT KEYWORDS

Arrays.sort()
-> Sorts the array in ascending order.

index
-> Position of an element in an array.

[1]
-> Second element because Java starts indexing from 0.

int[]
-> Integer array.

FLOW

Array -> sort -> index 0 smallest -> index 1 second smallest
*/