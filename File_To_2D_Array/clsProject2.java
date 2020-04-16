import java.io.*;
import java.util.StringTokenizer;

public class clsProject2
{
	public static void main(String[] args)throws IOException 
	{
		//Function calling and store the result in an array
		String[][] arr = get_years_quarters("loanamounts.txt");
		//Print output
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

	public static String [][] get_years_quarters(String strFile)throws IOException 
	{
		//Declaration of 2D array of String type which have 24 rows, 2 columns
		String[][] arr = new String[24][2];
		//Opening file
		FileReader fr=new FileReader(strFile);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int index=0;
		//Rear line by line store each line in string variable s
		while((s=br.readLine())!=null)
		{
			//Split s into tokens with respect to spaces
			StringTokenizer st = new StringTokenizer(s);
			//first token which is year
			arr[index][0]=st.nextToken();
			//second token which is quarter
			arr[index][1]=st.nextToken();
			//Increment the arr index
			index++;
		}
		//Closing file
		br.close();
		fr.close();
		//return arr
		return arr;
	}
}