import java.util.Arrays;
public class Sort {

	
	public static void main(String args[])
	{
		String a ="AaDFdgfa";
	    char [] c = a.toCharArray();
	    char temp;
	    
	    /*for(int i=0;i<c.length;i++)
	    {
	    
	    	for(int j=i+1;j<c.length;j++)
	    	{
	    		if(c[j]<c[i])
	    		{
	    			temp=c[i];
	    			c[i]=c[j];
	    			c[j]=temp;
	    		}
	    	}
	    }*/
	    Arrays.sort(c);
	    
	    System.out.println(new String(c));
	}
}
