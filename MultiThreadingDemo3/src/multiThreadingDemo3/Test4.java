package multiThreadingDemo3;

public class Test4 extends Thread {
	 public void run()
	 {
		 System.out.println("hi");
		 System.out.println("child thread : "+Thread.currentThread().isDaemon());
		 
		 
	 }

	public static void main(String[] args) {
		Test4 t4=new Test4();
		t4.start();
		
		System.out.println("main thread : "+Thread.currentThread().isDaemon());

	}

}
