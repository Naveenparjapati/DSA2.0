package Heap_Data_Structure;

import java.util.PriorityQueue;

public class pmg2_comprable {
	static class Student implements Comparable<Student> { // overriding
	    String name;
	    int rank;

	    public Student(String name, int rank) {
	        this.name = name;
	        this.rank = rank;
	    }

	    @Override
	    public int compareTo(Student s2) {
	        return this.rank - s2.rank;
	    }
	}

	
	public static void main(String args[]) {
		  PriorityQueue<Student> pq = new PriorityQueue<>();
			   
			pq.add(new Student("naveen", 1)); // O(logn)
		    pq.add(new Student("aveen", 78));
		    pq.add(new Student("veen", 56));
		    pq.add(new Student("een", 17));

		    while(!pq.isEmpty()) {
		        System.out.println(pq.peek().name+"-->"+pq.peek().rank); // O(1)
		        pq.remove(); // O(logn)
		    }
		}

}
