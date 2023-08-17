package multiThreadingDemo4;

class MyThread extends Thread
{
	 public void run()
	 {
		 System.out.println("hi: "+Thread.currentThread().getName());
		 System.out.println("child thread prirority : "+Thread.currentThread().getPriority());
	 }

}

public class Test {

	public static void main(String[] args) {
           MyThread mt=new MyThread();
           mt.start();
           
           Thread.currentThread().setPriority(8);
           System.out.println("hello : "+Thread.currentThread().getName());
           System.out.println("main thread priority: "+Thread.currentThread().getPriority());
	}

}
