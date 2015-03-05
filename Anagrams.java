import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class Anagrams {

	public static String sort(String a)
	{
		char[] char_array=a.toCharArray();
		Arrays.sort(char_array);
		//System.out.println(char_array.toString());
		return new String(char_array);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words={"cat","rat","tar","rta"};
		Hashtable<String,LinkedList<String>> hash =new Hashtable<String,LinkedList<String>>();
		for(String w:words)
		{
			String key=sort(w);
			if(!hash.containsKey(key))
			{
				hash.put(key, new LinkedList<String>());
			}
				LinkedList<String> anagrams=hash.get(key);
				anagrams.push(w);
		}
		
		for(String key:hash.keySet())
		{
			
		LinkedList<String> list = hash.get(key);
		System.out.println("key"+key);
		for(String s: list)
		{
			System.out.println(s);
		}
		}
		
		
	}

}
