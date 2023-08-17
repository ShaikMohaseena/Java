package outputStreamDemo;
import java.io.FileOutputStream;

public class WriteData {

	public static void main(String[] args) {

		try
		{
			String data="this is my first demo...!!";
			FileOutputStream fos=new FileOutputStream("E:\\aa.txt");
			byte[] b=data.getBytes();
			fos.write(b);
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
