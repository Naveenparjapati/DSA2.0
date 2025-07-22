package Comprator_Comprable;


import java.util.Arrays;
import java.util.Comparator;

public class Tw0_D_Array_Sorting {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 9},
            {3, 5},
            {2, 8},
            {4, 3}
        };

        // Sort by second column (index 1)  assending order
       // Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        // Print sorted array
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
