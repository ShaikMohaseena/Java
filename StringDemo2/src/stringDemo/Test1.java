package stringDemo;

public class Test1 {

	public static void main(String[] args) {
          String str1=new String ("pandu");
          System.out.println(str1);
          
          byte[] b= {97,98,99,100};
          String str2=new String(b);
          System.out.println(str2);
          
          char[] c= {'a','b'};
          String str3=new String(c);
          System.out.println(str3);
	}

}
