package multiThreadingDemo5;
class MyThread3 extends Thread
{
	public void run()
	{
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
		try
		{
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

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 mt=new MyThread3();
		mt.start();
		
		mt.interrupt();

	}

}
