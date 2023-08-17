package inputStreamDemo;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData
{

	public static void main(String[] args) 
	{
        FileInputStream fis=null;

		try
		{
			fis=new FileInputStream("E:\\my.java");
			       int i;
                    while ((i=fis.read()) !=-1)
                      {
        	                 System.out.print((char)i);
                      }
                      fis.close();
	    }
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fis.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
	

}
