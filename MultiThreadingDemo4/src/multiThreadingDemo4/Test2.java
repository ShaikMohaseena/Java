package multiThreadingDemo4;

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
		
		//mt2.setPriority(Thread.MAX_PRIORITY);
		mt2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(mt2.getPriority());

	}

}
