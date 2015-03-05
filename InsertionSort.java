import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int temp=0;
		System.out.println("Array");
		int []a = new int[6];
		Scanner in =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					temp =a[j];
					a[j] =a[j-1];
					a[j-1]=temp;
				}
			}
		}
		
		for(int x:a)
			System.out.println(x);
	
	}

}
