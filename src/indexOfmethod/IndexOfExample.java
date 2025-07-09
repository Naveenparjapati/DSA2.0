package indexOfmethod;

public class IndexOfExample {
    public static void main(String[] args) {
        String text = "Hello, world!";
        
        // Find the index of a character
        int indexOfW = text.indexOf('w');
        System.out.println("Index of 'w': " + indexOfW); // Output: 7

        // Find the index of a substring
        int indexOfWorld = text.indexOf("world");
        System.out.println("Index of 'world': " + indexOfWorld); // Output: 7

        // Find a character that does not exist
        int indexOfX = text.indexOf('x');
        System.out.println("Index of 'x': " + indexOfX); // Output: -1
    }
}
