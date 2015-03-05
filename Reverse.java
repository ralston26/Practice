import java.util.Scanner;

public class Reverse {

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		String string =in.next();
		StringBuilder newString= new StringBuilder();
		for(int i=string.length()-1;i>=0;i--)
		{
			newString.append(string.charAt(i));
		}
		System.out.println(newString.toString());
	
	}
	
	
	
}



