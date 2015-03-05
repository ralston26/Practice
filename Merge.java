
public class Merge {

	public static int [] merge(int[]a, int[]b,int lastA,int lastB)
	{
		int indexA=lastA-1;
		int indexB=lastB-1;
		int mergedIndex=lastA+lastB-1;
		while (indexA>=0)
		{
			if(indexB>=0 && a[indexA]>b[indexB])
			{
				b[mergedIndex]=a[indexA];
				indexA--;
			}	
			
			else
			{
				b[mergedIndex]=b[indexB];
				indexB--;
				
			}
			mergedIndex--;
		}
		
		
		
		
		return b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b=new int[7];
		
		int []a={3,7,9,10,32};
		b[0]=1;
		b[1]=88;
		b[2]=99;
		
		b=merge(a,b,5,3);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		
		
		
	}

}
