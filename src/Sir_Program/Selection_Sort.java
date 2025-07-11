package Sir_Program;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};  // Example array
        selectionSort(arr);  // Sorting the array using Selection Sort
        
        System.out.println("Sorted array: ");
        printArray(arr);  // Print the sorted array
    }

    // Selection Sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // Outer loop to go through each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current element is the minimum
            int minIndex = i;

            // Inner loop to find the smallest element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the current element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
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
