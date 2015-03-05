import java.util.Scanner;


public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean [] array = new boolean[256];
		Scanner in = new Scanner(System.in);
		String string = in.next();
		//char[] char_array=string.toCharArray();
		for(int i=0;i<string.length();i++)
		{
			if(array[string.charAt(i)])
			{
				System.out.println(false);
				break;
			}
	
			else
				
				
			{
				array[string.charAt(i)]=true;
				
			}
		}
		
	}

}
