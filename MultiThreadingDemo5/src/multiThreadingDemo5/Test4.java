package multiThreadingDemo5;
class MyThread4 extends Thread
{
	public void run()
	{
		System.out.println("is thread interrupted(1):"+Thread.currentThread().isInterrupted());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("hi :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("is thread interrupted(2):"+Thread.currentThread().isInterrupted());
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		MyThread4 mt=new MyThread4();
		mt.start();
		
		mt.interrupt();
		

	}

}
