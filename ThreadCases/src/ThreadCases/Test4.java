package ThreadCases;
//performing multiple tasks from multiple threads
class MyThread4 extends Thread
{
	public void run()
	{
		System.out.println("hi");
	}
}
class MyThread44 extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}
}
class MyThread444 extends Thread
{
	public void run()
	{
		System.out.println("hey");
	}
	
}

public class Test4 {

	public static void main(String[] args) {
             MyThread4 mt1=new MyThread4();
             mt1.start();
             
             MyThread44 mt2=new MyThread44();
             mt2.start();
             
             MyThread444 mt3=new MyThread444();
             mt3.start();
	}

}
