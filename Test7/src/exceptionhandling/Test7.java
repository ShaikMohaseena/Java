package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {

	public static void main(String[] args) throws FileNotFoundException
	{
		Test7 t2=new Test7();
		t2.m1();
	}
	void m1() throws FileNotFoundException
	{
		m2();
	}
	void m2() throws FileNotFoundException
	{
	       FileInputStream fis= new FileInputStream("")  ;

	}
	

}
