package multiThreadingDemo6;
class BookTrainSeat
{
	int total_seats=10;
	synchronized void bookSeat( int Seats, String name)
	{
		if(total_seats>=Seats)
		{
			System.out.println(name+"booked"+Seats+"seats successfully");
			total_seats=total_seats-Seats;
			System.out.println("total seats left:"+total_seats);
		}
		else
		{
			System.err.println(name+"sorry...!!seats not left");
			System.err.println("total seats left:"+total_seats);
		}
	}
}
	
class  MyThread1 extends Thread
{
    BookTrainSeat bts;
    int seats;
	public MyThread1(BookTrainSeat bts,int seats)
	{
		this.bts=bts;
		this.seats=seats;
	}
	
	public void run()
	{
		bts.bookSeat(seats,Thread.currentThread().getName());
	}
}

public class TrainReservation
{

	public static void main(String[] args) 
	{
		
		BookTrainSeat bts=new BookTrainSeat();
		
		
		MyThread1 deepak=new MyThread1(bts,5);
		deepak.setName("Deepak");
		deepak.start();
		
		MyThread1 amit=new MyThread1(bts,3);
		amit.setName("Amit");
		amit.start();

		MyThread1 rahul=new MyThread1(bts,4);
		rahul.setName("Rahul");
		rahul.start();


	}

}
