import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int testCount=in.nextInt();
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<testCount;i++)
		{
			int M =in.nextInt();
			int N = in.nextInt();
			int[] array =new int[N];
			for(int j=0;j<N;j++)
			{
				array[j]=in.nextInt();
				if(map.containsKey(array[j]))
				{
					System.out.println(j +"," +map.get(array[j]));
				}
				else
					map.put(M-array[j], j);
				
				
			}
			
			
		}
		
		
	}

}
