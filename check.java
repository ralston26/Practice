import java.util.Scanner;


public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			Scanner in =new Scanner(System.in);
			System.out.println("Count?");
			int count = in.nextInt();
			String[] word =new String[20];
			System.out.println("Word?");
			for(int i=0;i<count;i++)
			 word[i] = in.next();
			for(int j=0;j<count;j++)
			{
				if(word[j].equalsIgnoreCase(new StringBuilder(word[j]).reverse().toString()))
				{
					System.out.println("-1");
					return;
				}
			for(int i=0;i<word[j].length();i++)
			{
			String word1 = word[j].substring(0, i)+word[j].substring(i+1);	
			String word2 =new StringBuilder(word1).reverse().toString();
			if(word1.equalsIgnoreCase(word2))
				System.out.println(i);
			}
			}
		}
	}

}
