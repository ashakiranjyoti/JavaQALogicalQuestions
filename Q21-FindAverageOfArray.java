public class Q21FindAverageOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        double average = (double) sum / numbers.length;

        System.out.println(average);
    }
}

/*
HOW THIS FILE WORKS

I first calculate the total sum.

Then I divide the sum by the number of elements.

I use double so the answer can contain decimal values.

IMPORTANT KEYWORDS

double
-> Stores decimal values.

(double)
-> Type casting.

length
-> Number of array elements.

/
-> Division operator.

FLOW

Array -> sum -> divide by length -> average
*/