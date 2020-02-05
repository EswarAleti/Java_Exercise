public class BinaryNumber
{
	private int data[];
	private int length;

	public BinaryNumber(int length)
	{
		data = new int[length];
		this.length=length;
	}

	public BinaryNumber(String str)
	{
		this.length=str.length();
		data=new int[length];
		for(int i=0;i<length;i++)
		{
			data[i]=str.charAt(i)-'0';
		}
	}

	public int getLength()
	{
		return this.length;
	}

	public int getDigit(int index)
	{
		if(index<this.length)
		{
			return data[index];
		}
		else
		{
			System.out.println("false");
			return -1;
		}
	}

	public int[] getInnerArray()
	{
		return data;
	}

	public static int[] bwor(BinaryNumber bn1, BinaryNumber bn2)
	{
		int l1=bn1.getLength();
		int a[]=new int[l1];
		for(int i=0;i<l1;i++)
		{
			if(bn1.getDigit(i)==bn2.getDigit(i))
			{
				if(bn1.getDigit(i)==0)
				{
					a[i]=0;
				}
				if(bn1.getDigit(i)==1)
				{
					a[i]=1;
				}
			}
			if(bn1.getDigit(i)!=bn2.getDigit(i))
			{
				if(bn1.getDigit(i)==1)
				{
					a[i]=1;
				}
				else if(bn2.getDigit(i)==1)
				{
					a[i]=1;
				}
				else
				{
					a[i]=0;
				}
			}
		}
		return a;
	}
}