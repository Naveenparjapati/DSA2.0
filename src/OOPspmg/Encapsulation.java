package OOPspmg;

class SBI{
	 private String pwd="SBI@123";

	 public String getPwd() {
	 	return pwd;
	 }

	 public void setPwd(String pwd) {
	 	this.pwd = pwd;
	 }
}



public class Encapsulation {
  
   public static void main(String[] args)
   {
	 SBI sbi=new SBI();
	 System.out.print(sbi.getPwd());
	 sbi.setPwd("navi@#123");
	 System.out.print(sbi.getPwd());
   }
}
