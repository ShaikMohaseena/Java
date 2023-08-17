package stringDemo2;

public class Test3 {

	public static void main(String[] args) {
              String str1="Deepak@gmail.com";
              String str2="deepak123";
              
              if(str1.equalsIgnoreCase("Deepak@gmail.com")&& str2.equals("deepak123"))
              {
            	  System.out.println("login successfully");
              }
              else
              {
            	  System.out.println("failed");
              }
              System.out.println("------------------------------------------");
              
              String str3="a";
              String str4="A";
              System.out.println(str3.compareToIgnoreCase(str4));
              
             // char c='a';
              char c='A';
              System.out.println((int)c);
              System.out.println("-------------------------------------");
              
              String str5="deepak";
              String str6="java";
              System.out.println(str5+str6);
              System.out.println(str5.concat(str6));
              System.out.println("-------------------------------------------");
              
              
              String str7="deepak java";
              System.out.println(str7.substring(3, 8));
              System.out.println(str7.subSequence(3, 8));
              System.out.println(str7.replace("e", "x"));
              System.out.println("--------------------------------------------");
              
              String str8="deepak is teaching java";
              System.out.println(str8.lastIndexOf("is"));
              System.out.println(str8.contains("ep"));
              System.out.println(str8.charAt(7));
              System.out.println(str8.startsWith("deea"));
              System.out.println(str8.endsWith("java"));
              System.out.println("--------------------------------------------------");
              
              String str9="deepak panwar";
              System.out.println(str9.toLowerCase());
                
              int rollno=1001;
              System.out.println(String.valueOf(rollno).length());
              System.out.println("-----------------------------------------------");
              
              String str10="deepak";
              char[] C=str10.toCharArray();
              System.out.println(c);
              
              System.out.println(str10.replaceFirst("e", "z"));
              System.out.println("------------------------------------------------");
              
              String str11="this is my first demo";
              String[] str=str11.split("is");
              for(String s:str)
              {
            	  System.out.println(s);
              }
              
        }

}
