
 package callableDemo;
 class ThreadTask implements Runnable
 {
	 public void run()
	 {
		 System.out.println("hi");
	 }
 }

public class Test1
{

	public static void main(String[] args) {
		ThreadTask tt=new ThreadTask();
		Thread t1=new Thread(tt);
		t1.start();

	}

}
