import java.util.Scanner;
import java.util.Arrays;

public class Solution3 {

	public static int[] reverse(int a[], int start, int end)
	{
		int temp;
	    int length = end - start;
	    if(length <= 0) return a;
	    int length2 = length >> 1;
	    for (int i = 0; i < length2; ++i)
	    {
	        temp = a[start + i];
	        a[start + i] = a[end - i - 1];
	        a[end - i - 1] = temp;
	    }
	    
	    /**for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }**/
	    
	    return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  in =new Scanner(System.in);
		System.out.println("Size");
		int s =in.nextInt();
		int[] a = new int[s];
		int b[] = new int[s];
		for (int i=0;i<a.length;i++)
		{
			a[i]=i;

		}
		
		int k = in.nextInt();
		
		for(int i=0;i<s;i++)
		b=reverse(a,i,s);
			
		for(int i=0;i<s;i++)
		{
			if(b[i]==k)
				System.out.println(i);
		}
		
		
	}

}
