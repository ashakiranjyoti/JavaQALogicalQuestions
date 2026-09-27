public class Q35CheckPalindromeNumber {

    public static void main(String[] args) {

        int num = 121;
        int original = num;

        int reverse = 0;

        while (num > 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
HOW THIS FILE WORKS

I save the original number.

Then I reverse the number using % 10 and / 10.

Finally, I compare original and reverse.

IMPORTANT KEYWORDS

original
-> Stores the input before changing it.

reverse
-> Stores the reversed number.

==
-> Compares numeric values.

while
-> Repeats the reversing logic.

FLOW

Original -> reverse -> compare -> Palindrome / Not Palindrome
*/