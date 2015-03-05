
public class compress {

	public static void main(String args[]){
		
		String string ="aaabbbabccc";
		char [] a=string.toCharArray();
		StringBuilder s=new StringBuilder();
		int count=1;int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				count++;
			else
			{
				s.append(a[i]);
				s.append(count);
				count=1;
			}
		}
		
		System.out.println(s);
	}
	
}
