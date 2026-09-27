public class Q24RemoveSpacesFromString {

    static String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("Hello World JavaScript"));
    }
}

 /*
 HOW THIS FILE WORKS

 I use replaceAll() with the regular expression \\s to match whitespace characters and replace them with an empty string.

 IMPORTANT KEYWORDS

 replaceAll() -> Replaces all matches of a regular expression.
\\s -> Regex pattern for whitespace.
"" -> Empty string used as replacement.
return -> Returns the cleaned string.

 FLOW

 Input -> find whitespace -> replace with empty string -> cleaned string
 */