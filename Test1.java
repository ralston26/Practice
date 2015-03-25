import java.util.Scanner;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String s= in.next();
		String pattern=in.next();
		System.out.println(s.indexOf(pattern)!=-1);
		
		
	}

}
