import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(61234567,"Xyz");//ksks
		map.put(69910293,"xyz");
		
		
		Scanner in = new Scanner(System.in);
		String x= in.next();
		for (Entry<Integer, String> entry : map.entrySet())
		{
		    if(entry.getValue().equalsIgnoreCase("xyz"))
		    	System.out.println(entry.getKey());
		}
	}

}
