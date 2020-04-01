public class TextProcessing
{
	public static int getWordsNumber(String sentance)
	{
		int word=0;
		//Iterate through the sentance
		for(int i=0;i<sentance.length();i++)
		{
			//If you got space or tab then increment word count by 1
			if(sentance.charAt(i)==' ' || sentance.charAt(i)=='\t')
			{
				word++;
			}
		}
		//return word+1 since number of words = number of spaces+1
		return word+1;
	}
	public static int getVowelsNumber(String sentance)
	{
		//Initialize vowel to 0
		int vowel=0;
		//Conver sentance to lower case
		sentance=sentance.toLowerCase();
		for(int i=0;i<sentance.length();i++)
		{
			//ch has character at index i
			char ch=sentance.charAt(i);
			//if ch is vowel then increment count
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowel++;
			}
		}
		//return woel
		return vowel;
	}
	public static void displayBackwardString(String sentance)
	{
		System.out.println("Sentance in backward:");
		//Traverse from end to start and print each character
		for(int i=sentance.length()-1;i>=0;i--)
		{
			System.out.print(sentance.charAt(i));
		}
	}
	public static void main(String[] args) 
	{
		//Function calling and output printing
		String sentance="Hello how are you? Hope you are doing fine.";
		System.out.println("Sentance: "+sentance);
		System.out.println("Number of words: "+getWordsNumber(sentance));	
		System.out.println("Number of vowels: "+getVowelsNumber(sentance));
		displayBackwardString(sentance);
	}	
}