package multiThreadingDemo1;

public class Test1 extends Thread {
	// @Overriding
     public void run()
     {
    	 System.out.println("hi");
     }


	public static void main(String[] args) {
           
		Test1 t=new Test1();
		t.start();
		
	}

}
