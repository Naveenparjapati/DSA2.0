package indexOfmethod;

public class IndexOfFromIndexExample2 {

    public static void main(String[] args) {
        String text = "banana";
        
        // Find the index of 'a' starting from index 2
        int indexOfAFrom2 = text.indexOf('a', 2);
        System.out.println("Index of 'a' from index 2: " + indexOfAFrom2); // Output: 3

        // Find the index of 'a' starting from index 4
        int indexOfAFrom4 = text.indexOf('a', 4);
        System.out.println("Index of 'a' from index 4: " + indexOfAFrom4); // Output: -1
    }
}
