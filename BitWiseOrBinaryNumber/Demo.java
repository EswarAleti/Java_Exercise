public class Demo
{
	public static void main(String[] args) 
	{
		BinaryNumber bn1=new BinaryNumber("1001");
		BinaryNumber bn2=new BinaryNumber("1110");
		int a[]=BinaryNumber.bwor(bn1,bn2);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}	
	}
}