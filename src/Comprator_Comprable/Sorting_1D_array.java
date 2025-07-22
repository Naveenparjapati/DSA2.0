package Comprator_Comprable;

import java.util.Arrays;
import java.util.Comparator;

public class  Sorting_1D_array {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 7};

        // Ascending order
        Arrays.sort(arr, Comparator.comparingInt(a -> a));
        System.out.println("Ascending: " + Arrays.toString(arr));

        // Descending order
        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println("Descending: " + Arrays.toString(arr));
    }
}
