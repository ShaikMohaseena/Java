package multiThreadingDemo7;


public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread()
				{
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println("hi:"+i);
				}
			}
		};
		t1.start();
		Thread t2=new Thread()
				{
			 public void run()
			 {
				 for(int i=1;i<=10;i++)
				 {
					 System.out.println("hello:"+i);
				 }
			 }
			 
		};
		t2.start();

	}

}
