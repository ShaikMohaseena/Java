package multiThreadingDemo2;
class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread : "+i);
		}
	}
	void show()
	{
		System.out.println("hi");
	}
}

public class Test {

	public static void main(String[] args) {
        MyThread1 mt1=new MyThread1();
        Thread t=new Thread(mt1);
        t.start();
        
        for(int i=0;i<=10;i++)
        {
        	System.out.println("main thread : " +i);
        }
        mt1.show();
	}

}
