package ThreadCases;
//performing single task from multiple thread
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("hi");
	}
}

public class Test2 {

	public static void main(String[] args) {
              MyThread2 mt2=new MyThread2();
              mt2.start();
              
              MyThread2 mt22=new MyThread2();
              mt22.start();
              
              
	}

}
