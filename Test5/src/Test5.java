
public class Test5 {

	public static void main(String[] args) {
          try
          {
        	  System.out.println(100/0);
        	  int[] a= {10,20,30,40,50};
        	  System.out.println(a[5]);
          }
          catch( ArrayIndexOutOfBoundsException e)
          {
        	  System.out.println("Array index out of bounds....");
          }
          catch(ArithmeticException e)
          {
        	  System.out.println("you cannot divide by zero");
          }
          System.out.println("---------------Thank you-----------------");
	}

}
