package voting;
 
import java.util.Scanner;

public class Voting1 {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter your age: ");
           int age=sc.nextInt();
           
           if(age<18)
           {
        	   try
        	   {
        		   throw new InvalidAgeException("you  cannot vote as your age is below 18 ") ;
        	   }
        	   catch(InvalidAgeException e)
        	   {
        		   System.out.println(e.getMessage());
        	   }
           }
           else
           {
        	   System.out.println("you can vote now...!!");
           }
           
           
	}

}
