import java.util.Arrays;

public class Q11CheckAnagram {

    static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hey", "mnh"));
    }
}

 /*
 HOW THIS FILE WORKS

 I convert both strings to character arrays, sort them, and compare the sorted arrays. Anagrams produce the same sorted character sequence.

 IMPORTANT KEYWORDS

 toCharArray() -> Converts a String into a char array.
Arrays.sort() -> Sorts an array.
Arrays.equals() -> Compares array contents.
char[] -> Array of characters.

 FLOW

 String -> char array -> sort -> compare arrays -> anagram result
 */