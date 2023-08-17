package charStreamDemo;
import java.io.FileReader;

public class ReadDemo {

	public static void main(String[] args) {

		try
		{
			FileReader fr=new FileReader("E:\\copypaste\\BankApp.java");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
