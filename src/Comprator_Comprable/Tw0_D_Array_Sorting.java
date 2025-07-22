package Comprator_Comprable;


import java.util.Arrays;
import java.util.Comparator;

public class Tw0_D_Array_Sorting {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 9},
            {0, 5},
            {8, 8},
            {6, 3}
        };

        // Sort by second column (index 1)  assending order
      // Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        
        //descending order
        //Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
     
        
       // Sort by One Column, Then Another (Tie-breaker)
        Arrays.sort(arr, Comparator
        	    .comparingInt((int[] o) -> o[1])      // Primary sort by column 1
        	    .thenComparingInt(o -> o[0])          // Secondary sort by column 0
        	);

        
        // Print sorted array
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
