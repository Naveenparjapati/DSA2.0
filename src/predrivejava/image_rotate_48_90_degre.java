package predrivejava;

public class image_rotate_48_90_degre {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) //point i+ 1
            {
                // Swap elements at (i, j) and (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n / 2; j++)
            {
                // Swap elements 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
      
       
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        
        rotate(matrix);
        
        // Print  matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
