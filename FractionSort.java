import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class FractionSort {

	private static int gcdThing(int a, int b) {
	    BigInteger b1 = new BigInteger(""+a); 
	    BigInteger b2 = new BigInteger(""+b);
	    BigInteger gcd = b1.gcd(b2);
	    return gcd.intValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		Map<Float,Fraction> map = new TreeMap<Float,Fraction>();
		for(int i=0;i<5;i++)
		{
		String[] s=in.next().split("/");
		int num=Integer.parseInt(s[0]);
		int den=Integer.parseInt(s[1]);
		int gcd=gcdThing(num,den);
	      map.put( (float)num/den, new Fraction(num/gcd,den/gcd));
	         
		}   
	    
	    // print fractions
	    for(Entry e:map.entrySet())
	    {
	    	System.out.println(e.getValue());
	    	
	    }
	    
	}

}

