package Comprator_Comprable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Student implements Comparable<Student> {
	
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);   sort By Name
//		return this.id-o.id;           sort   By id
		return this.age-o.age;        //Sort By age
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(21, "Naveen", 99),new Student(23,"Rohit",32),new Student(14,"Ram",100));
		Collections.sort(list);
		
		for(Student li:list) {
			System.out.println(li);
		}
	}
	
	
	
	
}