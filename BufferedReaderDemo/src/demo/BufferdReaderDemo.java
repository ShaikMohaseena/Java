package demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferdReaderDemo {

	public static void main(String[] args) {
		try
		{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name : ");

		String s=br1.readLine();
		System.out.println(s);
		br1.close();
		

       }
		catch(Exception e)
		{
			System.out.println(e);
		}}
	
	

}
