package checkedException;


import java.io.FileNotFoundException;
import java .io.FileInputStream;
import java.io.IOException;

public class CheckedE {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		 try
		 {
             FileInputStream fis=new FileInputStream("");
               int i=fis.read();
               System.out.println(i);
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		
		 catch(IOException e)
		 {
			 System.out.println(e);
		 }
	}

}
