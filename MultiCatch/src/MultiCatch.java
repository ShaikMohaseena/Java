
public class MultiCatch {

	public static void main(String[] args) {
          try
          {
        	  System.out.println(100/2);
        	  int[] a= {10,20,30,40,50};
        	  System.out.println(a[5]);
          }
          catch(ArithmeticException e)
          {
        	  System.out.println(e);
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
        	  System.out.println(e);
          }
	}

}
