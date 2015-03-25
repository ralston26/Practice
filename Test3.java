import java.util.Arrays;
import java.util.Scanner;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String input=in.next();
		System.out.println(findSuffix(input));
		
	}

	private static String findSuffix(String input) {
		// TODO Auto-generated method stub
		String[] suffix = new String[input.length()];
		for(int i=0;i<input.length();i++)
		{
			suffix[i]=input.substring(i,input.length());
		}
		Arrays.sort(suffix);
		String longRepeat="";
		
		for(int i=0;i<suffix.length-1;i++)
		{
			String frequent=getFrequentString(suffix[i],suffix[i+1]);
			if(frequent.length()>longRepeat.length())
				longRepeat=frequent;
		}
		
		return longRepeat;
		
	}

	private static String getFrequentString(String string, String string2) {
		// TODO Auto-generated method stub
		
		int length=Math.min(string.length(), string2.length());
		for(int i=0;i<length;i++)
		{
			if(string.charAt(i)!=string2.charAt(i))
				return string.substring(0,i);
			
		}
		
		return string.substring(0,length);
	}

	

	

}
