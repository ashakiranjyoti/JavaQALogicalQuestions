public class Q39FindLongestWordInString {

    public static void main(String[] args) {

        String str = "I am learning Java";

        String[] words = str.split(" ");

        String longest = words[0];

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}

/*
HOW THIS FILE WORKS

I split the sentence into words.

I assume the first word is the longest.

Then I compare the length of every word and update longest when needed.

IMPORTANT KEYWORDS

split()
-> Splits a String into parts.

String[]
-> Array of Strings.

length()
-> Returns the length of a String.

for-each
-> Loops through each word.

FLOW

Sentence -> split into words -> compare lengths -> longest word
*/