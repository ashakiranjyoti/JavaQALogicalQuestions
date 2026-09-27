public class Q13CountLetter {

    static int countLetters(String str) {
        String value = str.replace(" ", "");
        return value.length();
    }

    public static void main(String[] args) {
        System.out.println(countLetters("Hey h"));
    }
}

 /*
 HOW THIS FILE WORKS

 I remove spaces from the string and then return the length of the remaining text.

 IMPORTANT KEYWORDS

 replace() -> Replaces occurrences of one character or string with another.
length() -> Returns the number of characters.
String -> Stores text.

 FLOW

 Input -> remove spaces -> length -> letter count
 */