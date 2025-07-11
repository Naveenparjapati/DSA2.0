package Sir_Program;

public class Bubble_sort_ {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  // Example array
        bubbleSort(arr);  // Sorting the array using Bubble Sort
        
        System.out.println("Sorted array: ");
        printArray(arr);  // Print the sorted array
    }

    // Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Outer loop to traverse through all elements
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
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
