import java.util.Arrays;

public class Q11CheckAnagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

/*
HOW THIS FILE WORKS

I convert both strings into character arrays.

Then I sort both arrays.

If the sorted arrays are equal, both strings contain the same characters,
so they are anagrams.

IMPORTANT KEYWORDS

toCharArray()
-> Converts a String into a character array.

Arrays.sort()
-> Sorts an array.

Arrays.equals()
-> Compares array contents.

char[]
-> Array of characters.

FLOW

String -> char array -> sort -> compare -> Anagram / Not Anagram
*/