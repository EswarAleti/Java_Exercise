public class StringManipulation
{
	public static String getReverseString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		System.out.println("Reverse of abcdef is: "+getReverseString("abcdef"));
	}	
}