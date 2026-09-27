public class Q03ReverseStringWithoutBuiltInMethod {

    public static void main(String[] args) {

        String str = "BTS";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }
}

/*
HOW THIS FILE WORKS

I start from the last character of the string and move backward.

Each character is added to the reverse variable.

IMPORTANT KEYWORDS

String
-> Stores text.

length()
-> Returns the number of characters.

charAt()
-> Returns the character at a given index.

for
-> Repeats code.

+
-> Concatenates strings.

FLOW

Last index -> move backward -> take character -> add to reverse
*/