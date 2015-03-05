import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.LineNumberReader;

import javax.swing.JTextArea;


public class Solution {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//private JTextArea jTextArea=new JTextArea(); 
		File file = new File("G:\\ral.txt");
		Scanner in = new Scanner(System.in);
		Scanner scanner = new Scanner(file);
		FileReader file1 =  new FileReader("G:\\ral.txt");
		BufferedReader br = new BufferedReader(file1);
		int count=0;
		System.out.println("Enter the text to search");
		String keyword = in.next();
 		while(scanner.hasNextLine())
 		{
			String word = scanner.nextLine();
			if(word.contains(keyword))
			{
				System.out.println(word);
				count++;
				System.out.println(count);
			}
			
			
 		} 
 		
 		/*String line;
 		while ((line = br.readLine()) != null)
 		{
 		   
 		        jTextArea.append(line + "\n");
 		  
 		}

 		
 		System.out.println(jTextArea);*/
	}

}
