import java.util.Scanner;
import java.util.Stack;


public class Balanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String s= in.next();
		System.out.println(isBalanced(s));
		
		
	}

	private static boolean isBalanced(String s) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='{' || s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
			}
			else if (s.charAt(i)=='}')
			{
				if(stack.isEmpty()||stack.pop()!='{')
					return false;
			}
			else if (s.charAt(i)==')')
			{
				if(stack.isEmpty()||stack.pop()!='(' )
					return false;
			}
			
		
		return stack.isEmpty() ;
		
		
	}

}
