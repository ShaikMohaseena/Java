package multiThreadingDemo5;
class MyThread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("hi:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class Test1 {

	public static void main(String[] args) {

		MyThread1 mt=new MyThread1();
		mt.start();
		try
		{
			mt.join();
			for(int i=1;i<=5;i++)
			{
				System.out.println("hello :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
