
public class LargestContinous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {4,-45,2,-3,6,7};
		System.out.println(findMaxSum(array));
		
	}

	public static int findMaxSum(int[ ] anArray)
	{
	  int currentSum = 0;
	  int currentMax = 0;

      int maxStartIndex=0;
      int maxEndIndex=0;
      int maxStartIndexUntilNow=0;

	  for (int j=0; j < anArray.length; j++)
	  {
	    currentSum += anArray[ j ];

	   if (currentMax < currentSum) 
	   {
		   currentMax = currentSum;
		   maxStartIndex=maxStartIndexUntilNow;
           maxEndIndex = j;
		   
	   }	   
	   else if (currentSum < 0)
	   {
	     currentSum = 0;
	   		maxStartIndexUntilNow=j+1;
	  }
	  }
	  System.out.println(maxStartIndex+","+maxEndIndex);
	  return currentMax;
	     
	}
}
