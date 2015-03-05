import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {2,45,7,3,5,1,8,9};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			
			if(map.containsKey(array[i]))
				System.out.println(array[i]+","+map.get(array[i]));
			else
				map.put(10-array[i], array[i]);
	
		}
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey());
		}
	
		
	}

}
