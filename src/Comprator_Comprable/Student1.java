package Comprator_Comprable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student1  {
	
	int id;
	String name;
	int age;

	public Student1(int id, String name, int age) {
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
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
     
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(3, "Ram", 22),new Student(2,"krishan",32),new Student(4,"Radha",21));
	 
		// Sort using Comparator without lambda (anonymous inner class)
    Collections.sort(list, new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    });

//	list.stream().filter(x->x.age>=22).forEach(System.out::println);
  
	list.forEach(x->System.out.println(x));
	}
}