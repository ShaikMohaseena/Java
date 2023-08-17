package callableDemo;
class ThreadTask4 implements Runnable
{
	ThreadLocal t1;
	public ThreadTask4(ThreadLocal t1)
	{
		this.t1=t1;
		
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":"+t1.get());
	}
}

public class Test4
{
   public static void main(String[] args)
   {
	   ThreadLocal t1=new ThreadLocal();
	   t1.set(t1);
	   System.out.println(Thread.currentThread().getName()+":"+t1.get());
	   ThreadTask4 tt=new ThreadTask4(t1);
	   Thread t=new Thread (tt);
	   t.start();
	   
   }
}
