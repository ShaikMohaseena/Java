package multiThreadingDemo5;
class MyThread5 extends Thread
{
	public void run()
	{
		System.out.println("is thread interrupted(1):"+Thread.currentThread().isInterrupted());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			for(int i=1;i<=5;i++ )
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
		System.out.println("is thread interrupted(3):"+Thread.currentThread().isInterrupted());

		
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 mt=new MyThread5();
		mt.start();
		
		mt.interrupt();

	}

}
