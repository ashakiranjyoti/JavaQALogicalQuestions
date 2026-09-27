public class Q36FindElementInTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        System.out.println("Common elements:");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}

/*
HOW THIS FILE WORKS

I compare every element of the first array with every element of the second array.

When both values are equal, I print the common element.

IMPORTANT KEYWORDS

nested for
-> A loop inside another loop.

==
-> Compares two values.

break
-> Stops the inner loop after a match.

int[]
-> Integer array.

FLOW

First array value -> search second array -> match? -> print
*/