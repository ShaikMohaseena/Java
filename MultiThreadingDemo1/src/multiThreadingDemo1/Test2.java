package multiThreadingDemo1;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("child thread: "+i);
		}
	}
}


public class Test2 {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			System.out.println("main thread : "+i);
		}
		MyThread t1=new MyThread();
		t1.start();

	}

}
