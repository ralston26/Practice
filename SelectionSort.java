import java.util.Scanner;


public class SelectionSort {

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
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp =a[i];
					a[i] =a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int x:a)
			System.out.println(x);
	}

}
