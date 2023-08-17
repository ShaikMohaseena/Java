package multiThreadingDemo2;
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("hi");
	}
}

public class Test2 {

	public static void main(String[] args) {
		MyThread2 mt2=new MyThread2();
		mt2.start();
	//	mt2.start();
 
	}

}
