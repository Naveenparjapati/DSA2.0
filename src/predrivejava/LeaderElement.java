package predrivejava;
import java.util.*;
public class LeaderElement {
	
	  public static List<Integer> leaderElement(int[] arr)
	  {
	    List<Integer> l=new ArrayList<Integer>();
	    
	    int max=arr[arr.length-1];
	    l.add(max);
	    for(int i=arr.length-2;i>=0;i--)
	    {
	      if(max<=arr[i])
	      {
	        max=arr[i];
	        l.add(arr[i]);
	      }
	    }
	    Collections.reverse(l);
	    return l;
	  }
	    public static void main(String[] args) {
	      int[] arr={16,17,4,3,5,2};
	      List<Integer> l=leaderElement(arr);
	      System.out.println(l);
	  }
	}
