package exceptionhandling3;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
           try
           {
        	   Class.forName("");
           }
           catch(Exception e)
           {
        	   Syem.out.println(e);
           }
           try(  Connection con=DriverManager.getConnection(" "," "," ");
        		   )
           
           {
        	   
           }
           catch(Exception e)
           {
        	   System.out.println(e);
           }
   }
}
