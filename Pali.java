import java.util.Scanner;


public class Pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String s= in.next();
		char[] array=s.toCharArray();
		int mid=array.length/2;
		int first=0;
		int last=array.length-1;
		int i=0;
		for( i=first;i<=mid;i++)
		{
			if(s.charAt(first)==s.charAt(last))
			{
				first++;
				last--;
			}
			else
				break;
				
		}
		if(i==mid+1)System.out.println("paliandrome");
		else 
			System.out.println("No");
	}

}
