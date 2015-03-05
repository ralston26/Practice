import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		int length = in.nextInt();
		String word="";
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0;i<length;i++)
		{
			word=in.next();
			if(map.get(word) != null)
				map.put(word,map.get(word)+1);
			else
				map.put(word, 1);
		}
		
		for(Entry<String, Integer> k :map.entrySet())
			System.out.println(k.getValue()+","+k.getKey());
			
		
	}

}
