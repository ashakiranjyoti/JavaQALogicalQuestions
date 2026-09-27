public class Q03ReverseStringWithoutBuiltInMethod {

    static String reverseString(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("BTS"));
    }
}

 /*
 HOW THIS FILE WORKS

 I start from the last character and move toward the first character. Each character is added to a new string, producing the reversed value without using reverse().

 IMPORTANT KEYWORDS

 charAt() -> Returns the character at a given index.
length() -> Returns the string length.
for -> Repeats a block of code.
+= -> Adds the right-side value to the existing variable.
char -> Java data type for a single character.

 FLOW

 Last character -> move backward -> append character -> continue until index 0
 */