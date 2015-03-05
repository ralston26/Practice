import java.util.HashSet;
import java.util.Scanner;


public class Panagrams {

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		String s;
		s=in.nextLine();
		String a=s.replaceAll("\\s+","");
		System.out.println(a);
		char char_array[]=a.toCharArray();
		HashSet h =new HashSet();
	
		for(char c :char_array)
		{
			h.add(c);
		
		}
		System.out.println(h.size());
	}
	
}
