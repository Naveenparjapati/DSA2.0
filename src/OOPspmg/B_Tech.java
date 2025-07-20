package OOPspmg;


//✅ Method Overriding using Polymorphism
 class Student {
 void stream() {
     System.out.print("Choose Stream\n");
 }
}

class CSE extends Student {
 void stream() {
     System.out.print("CSE\n");
 }
}

class ECE extends Student {
 void stream() {
     System.out.print("ECE\n");
 }
}

class EEE extends Student {
 void stream() {
     System.out.print("EEE\n");
 }
}

public class B_Tech {
 public static void simulator(Student b) {
     b.stream(); // Dynamic method dispatch
 }

 public static void main(String[] args) {
     CSE c1 = new CSE();
     ECE e1 = new ECE();
     EEE rr1 = new EEE();

     B_Tech.simulator(c1);   // Output: CSE
     B_Tech.simulator(e1);   // Output: ECE
     B_Tech.simulator(rr1);  // Output: EEE
 }
}
