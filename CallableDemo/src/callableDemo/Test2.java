package callableDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadTask2 implements Callable
{
	public Object call()
	{
		int a=10,b=20;
		int c;
		c=a+b;
		return c;
		
	}
}


public class Test2 {

	public static void main(String[] args) throws Exception {
		ThreadTask2 tt=new ThreadTask2();
		ExecutorService es=Executors.newFixedThreadPool(3);
		Future f=es.submit(tt);
		System.out.println(f.get());
		
		
		es.shutdown();
		

	}

}
