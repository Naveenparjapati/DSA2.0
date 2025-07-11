package Sir_Program;

public class insertion_sort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};  // Example array
        insertionSort(arr);  // Sorting the array using Insertion Sort
        
        System.out.println("Sorted array: ");
        printArray(arr);  // Print the sorted array
    }

    // Insertion Sort algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // Start from the second element, as the first element is trivially sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be inserted
            int j = i - 1;  // Index to compare with
            
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Insert the key at the correct position
            arr[j + 1] = key;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
