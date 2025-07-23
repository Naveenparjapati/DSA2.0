package greedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class MAximum_length_chain_pairs {
	 public static void main(String[] args) {
	      int[][] pairs={{5,24},{39,60},{5,28},{27,40},{50,90}};
	      
	      Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
	      int chainLen=0;
	      int ChainEnd=pairs[0][1];//last selected pairs
	      
	      for(int i=1;i<pairs.length;i++)
	      {
	        if(pairs[i][0]>ChainEnd)
	        {
	          chainLen++;
	          ChainEnd=pairs[i][0];
	        }
	      }
	      
	      
	      System.out.print("Maximum length of chain "+chainLen);
	      
	  }
}
