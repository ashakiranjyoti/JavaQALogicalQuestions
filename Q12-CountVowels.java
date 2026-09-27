public class Q12CountVowels {

    static int countVowels(String str) {
        String value = str.toLowerCase();
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < value.length(); i++) {
            if (vowels.indexOf(value.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("javascript"));
    }
}

 /*
 HOW THIS FILE WORKS

 I normalize the string to lowercase and check every character against the vowel string. If indexOf() finds the character, I increment the count.

 IMPORTANT KEYWORDS

 indexOf() -> Returns the position of a character or -1 when not found.
String -> Stores text.
charAt() -> Returns a character.
!= -> Checks that two values are not equal.

 FLOW

 Character -> check in "aeiou" -> count matching vowels -> final count
 */