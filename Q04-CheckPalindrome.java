public class Q04CheckPalindrome {

    static boolean isPalindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}

 /*
 HOW THIS FILE WORKS

 I reverse the string and compare it with the original string. When both strings are equal, the input is a palindrome.

 IMPORTANT KEYWORDS

 equals() -> Compares the content of two strings.
StringBuilder -> Helps reverse the string.
boolean -> Stores true or false.
return -> Returns the final comparison result.

 FLOW

 Original string -> reverse string -> compare using equals() -> true/false
 */