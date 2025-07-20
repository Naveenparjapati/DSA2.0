package OOPspmg;

//✅ Abstraction using Interface
 interface Student {
 void simulator(); // abstract method
}

//class CSE implements Student {
// public void stream() {
//     System.out.println("CSE");
// }
//}

//class ECE implements Student {
// public void stream() {
//     System.out.println("ECE");
// }
//}

class EEE implements Student{
 public void simulator() {
     System.out.println("EEE");
 }
}

public class Abstraction {
 public static void ola(Student a1) {
     a1.simulator(); // Polymorphic behavior
 }

 public static void main(String[] args) {
    Abstraction a1=new EEE();

//     simulator(c1);   // Output: CSE
//     simulator(e1);   // Output: ECE
    ola(a1); // Output: EEE
 }
}
