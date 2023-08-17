package multiThreadingDemo5;

class TakeAdmin extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Admin starts");
			Thread.sleep(5000);
			System.out.println("you have taken the admin successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class DepositFee extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("depositing fee");
			Thread.sleep(3000);
			System.out.println("you have deposit the fee successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
class TakeRollno extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Take rollno");
			Thread.sleep(1000);
			System.out.println("Now you can sit in exams....!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class ClgAdmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        TakeAdmin t1=new TakeAdmin();
        t1.start();
        
        t1.join();
        
        DepositFee t2=new DepositFee();
        t2.start();
        
        t2.join();
        
        TakeRollno t3=new TakeRollno();
        t3.start();
        
        t3.join();
        
	}

}
