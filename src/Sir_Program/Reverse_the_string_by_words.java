package Sir_Program;

public class Reverse_the_string_by_words {

    public static void main(String[] args) {
        String input = "Hello world from Java";
        String reversed = reverseWords(input);
        System.out.println("Reversed string by words: " + reversed);
    }

    // Function to reverse the string by words
    public static String reverseWords(String str) {
        // Split the string into words using space as the delimiter
        String[] words = str.split(" ");

        // Use StringBuilder to construct the reversed string
        StringBuilder reversedString = new StringBuilder();

        // Append the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            // Add space between words (except after the last word)
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }
}
