package multiThreadingDemo3;

public class MyThread5 extends Thread {
	public void run()
	{
		System.out.println("hi");
		System.out.println("child thread : "+Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
           MyThread5 mt=new MyThread5();
           mt.start();
           
	}

}
