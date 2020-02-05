import java.util.Scanner;
import java.io.*;

public class FiadLast
{
	public static void main(String[] args) throws IOException
	{
		//Creating object for Scanner class
		Scanner input=new Scanner(System.in);
		int num;
		while(true)
		{
			//User input
			System.out.print("Enter a number: ");
			num=input.nextInt();

			//File Handling
			File file = new File("uberstext.txt");
			Scanner keyboard=new Scanner(file);
			//found stores line number in which num found
			int lineNumber=1,found=0;
			while(keyboard.hasNextInt())
			{
				//If number found in text file then update found with lineNumber
				if(num==keyboard.nextInt())
				{
					found=lineNumber;
				}
				//Increment lineNumber by 1
				lineNumber++;
			}
			//Printing ouput
			if(found!=0)
			{
				System.out.println(num+" last appears in the file at position "+found);
			}
			else
			{
				System.out.println(num+" does not appear in the file");
			}
		}
	}
}