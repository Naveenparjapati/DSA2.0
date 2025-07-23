package greedyAlgo;

import java.util.Arrays;

public class Minimum_absolute_difrence_pairs {
	 public static void main(String[] args) {
	      int[] A={4,1,8,7};
	      int[] B={2,3,6,5};
	      
	      Arrays.sort(A);
	      Arrays.sort(B);
	      
	      int minDiff=0;
	      for(int i=0;i<A.length;i++)
	      {
	        minDiff +=Math.abs(A[i]-B[i]);
	      }
	      
	      System.out.print("Minimum abslute diffrence "+minDiff);
	      
	  }
}
