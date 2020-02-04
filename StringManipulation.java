/*
Write a recursive method called vowelsToEnd that takes a string as a parameter and returns a string in 
which all of the vowels have been moved to the end. The vowels should appear in reverse order of what
they were in the original word. For example, the call of vowelsToEnd("beautifully") should return "btfllyuiuae"
*/
class StringManipulation
{
	public static void main(String[] args) 
	{
		String str="beautifully";
		//Function calling
		System.out.println(vowelsToEnd(str,str.length()-1));
	}
	//Traverse from end to start
	public static String vowelsToEnd(String str, int index)
	{
		//If entire string traversed then return the final string
		if(index==-1)
		{
			return str;
		}
		//storing character at index into ch
		char ch=str.charAt(index);
		//If ch is vowel
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			//add ch to end
			str=str.substring(0,index)+str.substring(index+1)+ch;
		}
		//again call function with index-1
		return vowelsToEnd(str,index-1);
	}	
}