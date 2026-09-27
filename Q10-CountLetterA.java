public class Q10CountLetterA {

    public static void main(String[] args) {

        String str = "Ashakiran";
        str = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);
    }
}

/*
HOW THIS FILE WORKS

I convert the string to lowercase so both A and a are treated the same.

Then I check every character.
Whenever I find 'a', I increase count.

IMPORTANT KEYWORDS

toLowerCase()
-> Converts text to lowercase.

charAt()
-> Gets one character.

count++
-> Increases the count by 1.

char
-> Stores one character.

FLOW

String -> lowercase -> check each character -> count 'a'
*/