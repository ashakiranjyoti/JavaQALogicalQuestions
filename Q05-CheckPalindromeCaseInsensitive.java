public class Q05CheckPalindromeCaseInsensitive {

    static boolean isPalindrome(String str) {
        String value = str.toLowerCase();
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("MaDam"));
    }
}

 /*
 HOW THIS FILE WORKS

 I first convert the input to lowercase so uppercase and lowercase letters are treated the same. Then I reverse the normalized string and compare it with the original normalized value.

 IMPORTANT KEYWORDS

 toLowerCase() -> Converts letters to lowercase.
equals() -> Compares string content.
StringBuilder -> Used to reverse the string.
boolean -> Stores true or false.

 FLOW

 Input -> lowercase -> reverse -> compare -> palindrome result
 */