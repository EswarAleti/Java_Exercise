//Import required classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter; 
import java.util.Scanner;
public class FileOperations
{
	public static void main(String[] args) throws IOException
	{
		//User input for input file and output file
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a filename: ");
		String fileName=scanner.next();
		System.out.print("Enter an output file: ");
		String outFileName=scanner.next();

		//Filereading
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found...!");
		}

		//File Writing
		FileWriter fw=new FileWriter(outFileName);
		BufferedWriter bw=new BufferedWriter(fw);

		String s="";
		//Iterate till end of file
		while((s=br.readLine())!=null)
		{
			//Write reverse of string to file
			bw.write(reverse(s.toUpperCase())+'\n');
		}

		//close files
		bw.close();
		fw.close();
		br.close();
		fr.close();
	}

	//Method that reverse a string
	public static String reverse(String s)
	{
		String rev="";
		//Iterate from back to front and store character in rev string
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		//returen reversed string
		return rev;
	}	
}