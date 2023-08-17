package StringProgram;

public class RemCharFromStr {

	public static void main(String[] args) {
            String str="deepak java";
            char rem_ch='e';
            char [] ch_arr=str.toCharArray();
            int j=0,count=0;
            for(int i=0;i<str.length();i++)
            {
            	if(ch_arr[i]!=rem_ch)
            	{
            		ch_arr[j]=ch_arr[i];
            		j++;
            	}
            	else
            	{
            		count++;
            	}
            }
            while(count>0)
            {
            	ch_arr[j]=' ';
            	j++;
            	count--;
            }
            System.out.println(ch_arr);
	}

}
