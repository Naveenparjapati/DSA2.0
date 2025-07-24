package PairsinARRAYsubarray;


public class WaveMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {11, 12, 13},     // {11, 14, 17} 
            {14, 15, 16},     // {18, 15, 12}
            {17, 18, 19}  };  // {13, 16, 19} 
            
          
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) { 
            	// even column - top to bottom
                for (int row = 0; row < rows; row++)
                {
                    System.out.print(matrix[row][col] + " ");
                }
            } else { 
            	// odd column - bottom to top
                for (int row = rows - 1; row >= 0; row--)
                {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}

