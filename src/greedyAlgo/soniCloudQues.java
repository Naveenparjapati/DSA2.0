package greedyAlgo;

public class soniCloudQues {
	  public static void main(String[] args) {
	        int num = 14;
	        int steps = 0;

	        while (num > 0) {
	            if (num % 2 == 0) {
	                num = num / 2;
	            } else {
	                num = num - 1;
	            }
	            steps++;
	        }

	        System.out.println("Steps to reduce to zero: " + steps);
	    }
}
//✅ Explanation:
//This code implements a Greedy algorithm to reduce a number to zero using the minimum number of steps, using these two operations:
//
//If the number is even, divide it by 2.
//
//If the number is odd, subtract 1.
//
//It keeps a counter steps to count how many operations are performed.