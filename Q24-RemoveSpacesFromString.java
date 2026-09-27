public class Q24RemoveSpacesFromString {

    public static void main(String[] args) {

        String str = "Hello World Java";

        String result = str.replaceAll("\\s", "");

        System.out.println(result);
    }
}

/*
HOW THIS FILE WORKS

I use replaceAll() to find whitespace characters and replace them with nothing.

IMPORTANT KEYWORDS

replaceAll()
-> Replaces all matching parts of a String.

\\s
-> Regular expression for whitespace.

""
-> Empty string.

String
-> Stores text.

FLOW

String -> find spaces -> replace with empty string -> result
*/