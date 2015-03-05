import java.util.Scanner;


public class SpaceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String string = "this is my problem";
		char[] array= string.toCharArray();
		for(char c:array)
			System.out.println(c);
		int length = array.length;
		int newLength=0,space=0;
		for(int i=0;i<length-1;i++)
		{
			if(array[i]==' ')
				space++;
		}
		newLength = length+space*2;
		System.out.println(newLength);
		
		for(int i=length-1;i>=0;i--)
		{
			if(array[i]==' ')
			{
				array[newLength-1]=0;
				array[newLength-2]=2;
				array[newLength-3]='%';
				newLength= newLength-3;
			}
			else
			{
				array[newLength-1]=array[i];
				newLength= newLength-1;
			}
		}
		
		System.out.println(new String(array));
	}

}
