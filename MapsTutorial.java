import java.util.HashMap;
import java.util.TreeMap;


public class MapsTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap();
		map.put(26, "ralston");
		map.put(32, "ralston2");
		TreeMap maps = new TreeMap(map);
		for( Object key: maps.keySet())
		{
		
			System.out.println(map.get(key));
		}
		
	}

}
