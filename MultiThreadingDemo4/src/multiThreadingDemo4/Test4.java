package multiThreadingDemo4;

class MyThread4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+":"+Thread.currentThread().getName());
		}
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 mt4=new MyThread4();
	    mt4.start();
	    
	    Thread.yield();
	    
	    for(int i=1;i<=10;i++)
	    {
	    	System.out.println(i+":"+Thread.currentThread().getName() );
	    }
				

	}

}
