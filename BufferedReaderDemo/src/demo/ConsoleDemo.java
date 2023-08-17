package demo;
import java.io.Console;


public class ConsoleDemo {

	public static void main(String[] args) {

		try
		{
			
			Console c=System.console();
			String email1=c.readLine();
			char[] pass=c.readPassword();
			String pass1=new String(pass);
		if(email1.equals("admin@gmail.com")&& pass1.equals("admin123"))
		{
			System.out.println("login successfully");
		}
		else
		{
			System.out.println("login failed");
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
					
		}
	}

}
