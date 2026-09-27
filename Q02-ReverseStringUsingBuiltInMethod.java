public class Q02ReverseStringUsingBuiltInMethod {

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("BTS"));
    }
}

 /*
 HOW THIS FILE WORKS

 I use Java's StringBuilder class. I create a StringBuilder from the input, call reverse(), and convert the result back to a String with toString().

 IMPORTANT KEYWORDS

 String -> Java class used to store text.
StringBuilder -> Mutable class used to build and modify strings.
new -> Creates an object.
reverse() -> Reverses the StringBuilder content.
toString() -> Converts the object into a String.

 FLOW

 String -> StringBuilder -> reverse() -> toString() -> reversed String
 */