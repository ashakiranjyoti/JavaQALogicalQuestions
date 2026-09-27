public class Q22CountPositiveAndNegativeNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, -5, 20, -8, 15};

        int positive = 0;
        int negative = 0;

        for (int num : numbers) {

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}

/*
HOW THIS FILE WORKS

I use two counters.

If the number is greater than 0, I increase positive.
If it is less than 0, I increase negative.

Zero is ignored.

IMPORTANT KEYWORDS

>
-> Greater-than operator.

<
-> Less-than operator.

else if
-> Checks another condition.

count++
-> Increases the counter.

FLOW

Number -> positive? -> positive++ -> otherwise negative? -> negative++
*/