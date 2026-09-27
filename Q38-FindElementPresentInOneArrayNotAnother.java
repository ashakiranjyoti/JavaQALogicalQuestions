public class Q38FindElementPresentInOneArrayNotAnother {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4};

        System.out.println("Elements only in first array:");

        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(arr1[i]);
            }
        }
    }
}

/*
HOW THIS FILE WORKS

For every value in the first array, I search for the same value in the second array.

If I do not find it, I print that value.

IMPORTANT KEYWORDS

boolean
-> Stores true or false.

found
-> Tells whether a match was found.

!
-> Logical NOT.

nested for
-> Loop inside another loop.

FLOW

First array value -> search second array -> found? -> no: print
*/