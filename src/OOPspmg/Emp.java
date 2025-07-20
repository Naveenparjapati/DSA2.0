package OOPspmg;

interface Student{
	void num();
}

class Lulu implements Student{
	public void num() {
		System.out.println("Mitha Lola");
	}
}

public class Emp {
	public static void simulator(Student a1) {
		a1.num();
	}
	public static void main(String[] args) {
		Lulu l1=new Lulu();
		simulator(l1);
}}
