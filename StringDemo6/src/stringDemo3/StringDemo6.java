package stringDemo3;

public class StringDemo6 {

	public static void main(String[] args) {
            String name="deepak";
           name= name.concat("java");
            System.out.println(name);
            
            StringBuffer sb= new StringBuffer("deepak");
            sb.append("java");
           System.out.println(sb);
            StringBuilder sbb=new StringBuilder("deepak");
           System.out.println(sb.insert(3, "abc"));
	}

}
