package multiThreadingDemo5;
class MyThread2 extends Thread
{
	Thread t;
	MyThread2(Thread t)
	{
		this.t=t;
		
	}
	public void run()
	{
		try
		{
			t.join();
			for(int i=1;i<=5;i++)
			{
				System.out.println("hi :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class Tesst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		MyThread2 mt=new MyThread2(t);
		mt.start();
		
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
