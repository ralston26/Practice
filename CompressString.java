import java.util.Scanner;


public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		String s=in.next();
		System.out.println(compressString(s));
	}

	private static String compressString(String s) {
		// TODO Auto-generated method stub
		StringBuffer string = new StringBuffer();
		char previousChar=s.charAt(0);
		int count=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==previousChar)
				count++;
			else
			{
				string.append(previousChar);
				string.append(count);
				previousChar=s.charAt(i);
				count=1;
			}
				
		}
		
		string.append(previousChar);
		string.append(count);
		return string.toString();
	}

}
