package stringDemo3;

import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {
          StringTokenizer st=new StringTokenizer("this is my first demo");
          System.out.println(st.countTokens());
          while(st.hasMoreTokens())
          {
		     System.out.println(st.nextToken());
		
	      }    

     }
}
