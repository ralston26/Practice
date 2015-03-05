import java.util.Scanner;


public class ProductProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  in =new Scanner(System.in);
		System.out.println("Size");
		int s =in.nextInt();
		int[] a = new int[s];
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
			product = a[i] == 0 ? product : product * a[i];
		}
		
				
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				a[i]=product/a[i];
			else
				a[i]=product;
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
