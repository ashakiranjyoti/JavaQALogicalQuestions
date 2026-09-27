public class Q05CheckPalindromeCaseInsensitive {

    public static void main(String[] args) {

        String str = "MaDam";

        str = str.toLowerCase();

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
HOW THIS FILE WORKS

I first convert the string to lowercase.

Then I reverse it and compare both values.

This makes the check case-insensitive.

IMPORTANT KEYWORDS

toLowerCase()
-> Converts a string to lowercase.

equals()
-> Compares String content.

reverse()
-> Reverses the StringBuilder.

if-else
-> Used to decide the output.

FLOW

Input -> lowercase -> reverse -> compare -> result
*/