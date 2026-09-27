public class Q25CountWordsInString {

    public static void main(String[] args) {

        String str = "I am learning Java";

        str = str.trim();

        String[] words = str.split("\\s+");

        System.out.println(words.length);
    }
}

/*
HOW THIS FILE WORKS

I remove extra spaces from the beginning and end using trim().

Then I split the string into words.

The length of the String array gives the number of words.

IMPORTANT KEYWORDS

trim()
-> Removes leading and trailing spaces.

split()
-> Splits a String into parts.

String[]
-> Array of Strings.

length
-> Number of elements in the array.

FLOW

Sentence -> trim -> split into words -> length -> word count
*/