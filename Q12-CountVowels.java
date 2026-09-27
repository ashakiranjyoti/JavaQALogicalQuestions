public class Q12CountVowels {

    public static void main(String[] args) {

        String str = "javascript";
        str = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println(count);
    }
}

/*
HOW THIS FILE WORKS

I check every character in the string.

If the character is a, e, i, o, or u, I increase the count.

IMPORTANT KEYWORDS

char
-> Stores one character.

||
-> Logical OR.

charAt()
-> Gets a character at an index.

count++
-> Increases the count.

FLOW

String -> check each character -> vowel? -> count++
*/