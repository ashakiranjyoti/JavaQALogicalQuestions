public class Q04CheckPalindrome {

    public static void main(String[] args) {

        String str = "madam";

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

I reverse the string and compare it with the original string.

If both strings are equal, it is a palindrome.

IMPORTANT KEYWORDS

equals()
-> Compares the content of two Strings.

if
-> Checks a condition.

else
-> Runs when the condition is false.

StringBuilder
-> Used here to reverse the string.

FLOW

Original string -> reverse -> compare -> Palindrome / Not Palindrome
*/