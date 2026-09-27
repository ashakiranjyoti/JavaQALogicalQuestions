public class Q39FindLongestWordInString {

    static String findLongestWord(String str) {
        String value = str.trim();

        if (value.isEmpty()) {
            return "";
        }

        String[] words = value.split("\\s+");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(
            findLongestWord("I am learning JavaScript")
        );
    }
}

 /*
 HOW THIS FILE WORKS

 I split the sentence into words, assume the first word is longest, and compare every other word by length.

 IMPORTANT KEYWORDS

 String[] -> Array of strings.
split() -> Separates the input into words.
length() -> Returns string length.
trim() -> Removes leading and trailing spaces.

 FLOW

 Split sentence -> assume first word -> compare lengths -> update longest
 */