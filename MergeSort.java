import java.util.Scanner;


public class MergeSort {

	
	
	public static void main(String args[])
	{
		   Scanner scanner = new Scanner(System.in);
		    String readString = scanner.nextLine();
		    while(readString!=null) {
		        System.out.println(readString);
		        if (readString.equals(""))
		            System.out.println("Read Enter Key.");
		        if (scanner.hasNextLine())
		            readString = scanner.nextLine();
		        else
		            readString = null;
		    }
	}
}
