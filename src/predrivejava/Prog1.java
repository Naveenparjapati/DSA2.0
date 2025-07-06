package predrivejava;
import java.util.HashSet;

public class Prog1 {
	    public static int abc(int[] nums) {
	        
	        if (nums == null || nums.length == 0)
	        {
	            return 0;
	        }

	        HashSet<Integer> s = new HashSet<>();
	        for (int num : nums) 
	        {
	            s.add(num);
	        }

	        int maxLg = 0;

	        for (int num : nums) 
	        { 
	            if (!s.contains(num - 1))
	            {
	                int cn = num;
	                int cs = 1;

	                while (s.contains(cn + 1)) 
	                {
	                    cn++;
	                    cs++;
	                }
	                maxLg = Math.max(maxLg, cs);
	            }
	        }
	        return maxLg;
	    }

	    public static void main(String[] args) 
	    {
	        int[] nums = {100, 4, 200, 1, 3, 2};
	        System.out.println("output " + abc(nums));
	    }
	}



