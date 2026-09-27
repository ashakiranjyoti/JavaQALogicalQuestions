public class Q14CountUppercaseLetters {

    public static void main(String[] args) {

        String str = "JavaASScript";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        System.out.println(count);
    }
}

/*
HOW THIS FILE WORKS

I check every character.

If a character is between A and Z, I count it as uppercase.

IMPORTANT KEYWORDS

char
-> Stores one character.

>= and <=
-> Comparison operators.

&&
-> Logical AND.

count++
-> Increases the count.

FLOW

Character -> A to Z? -> yes -> count++
*/