import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in=new Scanner(System.in);
		String s=in.next();
		permutation("",s);
	}

	private static void permutation(String prefix, String s) {
		// TODO Auto-generated method stub
		int n =s.length();
		if(n==0)
			System.out.println(prefix);
		else
		{
			for(int i=0;i<n;i++)
				permutation(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,n));
		}
		
		
	}

}
