public class Q10CountLetterA {

    static int countLetterA(String str) {
        String lower = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countLetterA("Ashakiran"));
    }
}

 /*
 HOW THIS FILE WORKS

 I convert the string to lowercase and scan every character. Whenever the character is 'a', I increase the counter.

 IMPORTANT KEYWORDS

 toLowerCase() -> Converts the string to lowercase.
charAt() -> Gets a character by index.
count++ -> Increases count by one.
== -> Compares primitive values.

 FLOW

 String -> lowercase -> check each char -> increment count -> return count
 */