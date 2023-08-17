package multiThreadingDemo1;
class PlayVideo2 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("video is playing");
		}
	}
}
class PlaySound2 extends Thread
{
	public void run()
	{
		
	
	             for(int i=0;i<=100;i++)
              	{
		              System.out.println("sound is executed");
	            } 
	}
	
}

public class Vlc2 {

	public static void main(String[] args) {
		
		PlayVideo2 pv=new PlayVideo2();
		pv.start();
		
		PlaySound2 ps=new PlaySound2();
		ps.start();

	}

}
