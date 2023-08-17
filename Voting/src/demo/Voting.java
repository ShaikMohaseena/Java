package demo;

public class Voting {
	public static void main(String[] main)
	{
		int age=10;
		Voting  v=new Voting();
		v.CheckAge(age);
	}
	void CheckAge( int age)
	{
		if(age>=18)
		{
			youCanVote();
		}
	
	  else
	  {
		    throw new RuntimeException("You cannot vote");
	  }
	}
	void youCanVote()
	{
		System.out.println("You can vote successfully");
	}

}
