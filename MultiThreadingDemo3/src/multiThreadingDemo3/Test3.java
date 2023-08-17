package multiThreadingDemo3;

public class Test3 extends Thread {
	public void run()
	{
		System.out.println("hi");
		System.out.println("old child thread name:" +Thread.currentThread().getName());
		Thread.currentThread().setName("my_child_thread");
		System.out.println("new child thread name: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Test3 t3=new Test3();
		t3.start();
          
	}

}
