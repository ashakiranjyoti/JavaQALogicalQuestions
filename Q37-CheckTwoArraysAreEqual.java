public class Q37CheckTwoArraysAreEqual {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean equal = true;

        if (arr1.length != arr2.length) {
            equal = false;
        } else {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}

/*
HOW THIS FILE WORKS

First I compare the array lengths.

If lengths are the same, I compare each element at the same index.

If any element is different, the arrays are not equal.

IMPORTANT KEYWORDS

boolean
-> Stores true or false.

length
-> Number of array elements.

break
-> Stops the loop when a difference is found.

!=
-> Not-equal operator.

FLOW

Compare length -> compare elements -> any difference? -> result
*/