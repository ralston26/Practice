import java.util.HashSet;


public class SpringTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ralston";
		SpringTutorial s = new SpringTutorial();
		System.out.println(s.checkUniqueString(a));
		System.out.println(s.checkString(a));
		
		
	}
	public boolean checkUniqueString(String a)
	{
		HashSet hash = new HashSet(a.length());
		char[] char_array = a.toCharArray();
		for (char c : char_array)
		{
			if(!hash.add(c))
			return false;
		}
		return true;
	}
	
	public boolean checkString(String a)
	{
		boolean array[]=new boolean[256];
		for(int i=0;i<a.length();i++)
		{
			System.out.println(a.charAt(i));
			System.out.println();
			if(array[a.charAt(i)])
				return false;
			array[a.charAt(i)]=true;
		}
		return true;
	}
	
}
