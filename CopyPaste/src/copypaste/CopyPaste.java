package copypaste;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste {

	public static void main(String[] args) {

		try
		{
			FileInputStream fis=new FileInputStream("E:\\copypaste\\thankyou.png");
			FileOutputStream fos=new FileOutputStream("E:\\copypaste\\newing.png");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}

			fis.close();
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
