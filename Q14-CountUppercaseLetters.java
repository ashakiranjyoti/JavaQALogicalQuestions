public class Q14CountUppercaseLetters {

    static int countUppercase(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countUppercase("JavaASScript"));
    }
}

 /*
 HOW THIS FILE WORKS

 I scan each character and use Character.isUpperCase() to check whether it is uppercase.

 IMPORTANT KEYWORDS

 Character -> Java utility class for character operations.
isUpperCase() -> Checks whether a character is uppercase.
charAt() -> Gets a character at an index.
count++ -> Increases the counter.

 FLOW

 String -> each character -> isUpperCase? -> increment -> final count
 */