public class Q25CountWordsInString {

    static int countWords(String str) {
        String value = str.trim();

        if (value.isEmpty()) {
            return 0;
        }

        String[] words = value.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("I am learning Java"));
    }
}

 /*
 HOW THIS FILE WORKS

 I remove extra spaces at the ends, handle the empty-string case, split the remaining text by one or more whitespace characters, and return the array length.

 IMPORTANT KEYWORDS

 trim() -> Removes leading and trailing spaces.
split() -> Splits a string into parts.
\\s+ -> Matches one or more whitespace characters.
String[] -> Array of strings.
isEmpty() -> Checks whether the string has no characters.

 FLOW

 Input -> trim -> split into words -> length -> word count
 */