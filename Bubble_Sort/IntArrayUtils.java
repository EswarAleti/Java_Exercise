public class IntArrayUtils
{
	public static void intBubbleSort(int[] array)
	{
		//Iterate till last but one element
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				//If previous element is greater than current element then swap
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public static void intDisplayArray(int[] array)
	{
		//For each element in array
		for(int i=0;i<array.length;i++)
		{
			//Print element with one white spaces
			System.out.print(array[i]+" ");
		}
		//Print a new line after printing
		System.out.println();
	}	
}