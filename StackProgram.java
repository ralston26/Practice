import java.util.Stack;


public class StackProgram {

	public static int getStackElement(Stack<Integer> stack, int index)
	{
		   if (index == 0)   
			   return stack.peek();

		     Integer element = stack.pop();
		     try{
		        return getStackElement(stack, index-1);
		     }
		     catch(Exception e)
		     {
		    	 System.out.println("Out of Range");
		    	 return -1;
		     }
		     finally{
		        stack.push(element);
		     }
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(getStackElement(stack,2));
		System.out.println(getStackElement(stack,6));
		System.out.println(getStackElement(stack,3));
		
	}

}
