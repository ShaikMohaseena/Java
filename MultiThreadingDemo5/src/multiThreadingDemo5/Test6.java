package multiThreadingDemo5;
class MyThread6 extends Thread
{
	public void run()
	{
		System.out.println("is thread interrupted(1):"+Thread.currentThread().isInterrupted());
		System.out.println("is thread interrupted(2):"+Thread.currentThread().isInterrupted());
		System.out.println("is thread interrupted(2):"+Thread.currentThread().isInterrupted());
		System.out.println("is thread interrupted(2):"+Thread.currentThread().isInterrupted());
		System.out.println("is thread interrupted(2):"+Thread.currentThread().isInterrupted());

	}
	
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 mt=new MyThread6();
		mt.start();
		mt.interrupt();

	}

}
