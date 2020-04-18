class MergeArrays
{
	public static void main(String[] args) 
	{
		int arr1[]={13,45,67,78,89};
		int arr2[]={1,34,46,57,99};
		int[] arr=merge(arr1,arr2);
		System.out.println("Array after merging: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] merge(int arr1[],int arr2[])
	{
		int[] arr=new int[arr1.length + arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				arr[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length)
		{
			arr[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
		return arr;
	}
}