import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		
		int n = in.nextInt();
		int[] array =new int[n];
		for(int i=0;i<n;i++)
			array[i]=in.nextInt();

		int first=0;
		int last=n-1;
		System.out.println("search element");
		int search =in.nextInt();
		while(first<=last)
		{
		int middle =(first+last)/2;
		if(search>array[middle])
			first =middle+1;
		else if(search<array[middle])
			last=middle-1;
		else
		{
			System.out.println(middle);
			break;
		}}
			
		
		
		
		
	}

}
