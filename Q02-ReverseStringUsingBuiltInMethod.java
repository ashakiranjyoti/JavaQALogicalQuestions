public class Q02ReverseStringUsingBuiltInMethod {

    public static void main(String[] args) {

        String str = "BTS";

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println(reverse);
    }
}

/*
HOW THIS FILE WORKS

I store the string in a variable.

I use StringBuilder to reverse the string and then print the reversed value.

IMPORTANT KEYWORDS

String
-> Stores text.

StringBuilder
-> Java class used to modify strings.

reverse()
-> Reverses the characters.

toString()
-> Converts the StringBuilder value into a String.

new
-> Creates an object.

FLOW

String -> StringBuilder -> reverse() -> output
*/