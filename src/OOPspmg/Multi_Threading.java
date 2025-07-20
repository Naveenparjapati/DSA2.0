package OOPspmg;

//Note : if you want proper order then make this method as syncronized
class demo
{
	public static void m1()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				 Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i);
		}
		
	}
	
	public static void m2()
	{
		for(int i=11;i<=20;i++)
		{
			try {
				 Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i);
		}
		
	}
}

class Thread1 extends Thread
{
	public void run()
	{
		demo.m1();
	}
}


class Thread2 extends Thread
{
	public void run()
	{
		demo.m2();
	}
}



public class Multi_Threading {
  public static void main(String[] args)
  {
	  Thread1 t1 = new Thread1();
      Thread2 t2 = new Thread2();

      // ✅ Start the actual threads
      t1.start();
      t2.start();
  }
}
