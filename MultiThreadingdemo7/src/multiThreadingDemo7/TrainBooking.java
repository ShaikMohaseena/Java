package multiThreadingDemo7;
class BookTicket
{
	static int total_seats=10;
	static synchronized void bookTicket(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println("success");
			total_seats=total_seats-seats;
			System.out.println("seats left:"+total_seats);
			
		}
		else
		{
			System.out.println("fail");
		}
	}
}
class MyThread1 extends Thread
{
	BookTicket bt;
	int seats;
	MyThread1(BookTicket bt,int seats)
	{
		this.bt=bt;
		this.seats=seats;
	}
	public void run()
	{
		bt.bookTicket(seats);
	}
}

public class TrainBooking {

	public static void main(String[] args) {
 
		BookTicket bt1=new BookTicket();
		MyThread1 t1=new MyThread1(bt1,7);
		t1.start();
		
		MyThread1 t2=new MyThread1(bt1,4);
		t2.start();
		
		//------------------------------------------------------------------------
		BookTicket bt2=new BookTicket();
		MyThread1 t3=new MyThread1(bt2,5);
		t3.start();
		
		MyThread1 t4=new MyThread1(bt2,6);
		t4.start();
		
		
		

	}

}
