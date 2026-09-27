public class Q13CountLetter {

    public static void main(String[] args) {

        String str = "Hey h";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}

/*
HOW THIS FILE WORKS

I check every character in the string.

If the character is not a space, I increase the count.

IMPORTANT KEYWORDS

!=
-> Checks that two values are not equal.

charAt()
-> Gets a character.

count++
-> Increases the counter.

length()
-> Returns string length.

FLOW

String -> check each character -> space? -> no: count++
*/