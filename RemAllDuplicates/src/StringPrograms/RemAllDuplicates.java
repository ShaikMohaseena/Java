package StringPrograms;
 
import java.util.Arrays;

public class RemAllDuplicates {

	public static void main(String[] args) {
		 String str="Deepak java";
		 char[] ch=str.toCharArray();
		 int count=0;
		 for(int i=0;i<str.length();i++)
		 {
			 int j;
			 for(j=0;j<i;j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 break;
					
				 }
			 }
			 if(i==j)
			 {
				 ch[count]=ch[i];
				 count++;
			 }
		 }
		 while(count<str.length())
		 {
			 ch[count]=' ';
			 count++;
			 
		 }
		 System.out.println(ch);
		 String newstr=String.valueOf(Arrays.copyOf(ch, count));
		 System.out.println(newstr);
              
	}

}
