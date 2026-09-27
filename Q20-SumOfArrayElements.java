public class Q20SumOfArrayElements {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        System.out.println(sum);
    }
}

/*
HOW THIS FILE WORKS

I start sum with 0.

Then I add every array element to sum.

Finally, I print the total.

IMPORTANT KEYWORDS

int
-> Stores an integer.

for-each
-> Loops through every array value.

+
-> Adds values.

sum
-> Stores the total.

FLOW

sum=0 -> add each number -> final sum
*/