package multiThreadingDemo1;
class PlayVideo
{
	 void executedVideo()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("video is playing");
		}
	}
	 
}
class PlaySound
{
	void executedSound() {
		for(int i=0;i<100;i++)
		{
			System.out.println("sound is executing");
		}
	}
}

public class Vlc1 {

	public static void main(String[] args) {
		PlayVideo pv=new PlayVideo();
		pv.executedVideo();
		
		PlaySound ps=new PlaySound();
		ps.executedSound();

	}

}
