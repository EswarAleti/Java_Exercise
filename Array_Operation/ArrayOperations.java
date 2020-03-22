public class ArrayOperations
{
	public static void printArray(int[] arr, String s)
	{
		//Iterate till last but not element of array
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+s);
		}
		//last element should not concatenated with string
		System.out.println(arr[arr.length-1]);
	}
	public static int getFirst(int[] arr)
	{
		//first element of array is at index 0
		return arr[0];
	}
	public static int getLast(int[] arr)
	{
		//last element of array is at index arr.length-1
		return arr[arr.length-1];
	}
	public static int[] getAllButFirst(int[] arr)
	{
		//Initialize arr with size arr.length-1
		int[] newArr=new int[arr.length-1];
		//copy values of arr from index 1 till last elements
		for(int i=1;i<arr.length;i++)
		{
			newArr[i-1]=arr[i];
		}
		//return array
		return newArr;
	}
	public static int getIndexOfMin(int[] arr)
	{
		//assume first element as minimum
		int min=0;
		for(int i=1;i<arr.length;i++)
		{
			//If new minimum found then update min
			if(arr[i]<arr[min])
			{
				min=i;
			}
		}
		//return minimum index
		return min;
	}
	public static int getIndexOfMax(int[] arr)
	{
		//assume firt element as maximum
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			//If new maximum found then update max
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		//return max
		return max;
	}
	public static void swapByIndex(int[] arr, int i, int j)
	{
		//swapping
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int[] removeAtIndex(int[] arr,int index)
	{
		//initialize new array
		int[] newArr=new int[arr.length-1];
		//index of new array
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			//if i is not required index then copy value
			if(i!=index)
			{
				newArr[j]=arr[i];
				j++;
			}
		}
		//return new array
		return newArr;
	}
	public static int[] insertAtIndex(int[] arr,int index, int val)
	{
		int[] newArr=new int[arr.length+1];
		int j=0;
		//Insert till index
		for(int i=0;i<index;i++)
		{
			newArr[j]=arr[i];
			j++;
		}
		//insert val at index, here j=index
		newArr[j]=val;
		j++;
		//insert remaining elements
		for(int i=index;i<arr.length;i++)
		{
			newArr[j]=arr[i];
			j++;
		}
		//return new array
		return newArr;
	}
	public static boolean isSorted(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			//If previous element is larger than current element array is not sorted
			//then return false
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		//will get here if array is sorted
		return true;
	}
	public static void main(String[] args) 
	{
		//Function calling and output printing

		int[] myArray = {1, 22, 333, 400, 5005, 9}; 
		printArray(myArray, ", ");
		printArray(myArray, " - ");

		System.out.println(getFirst(myArray));
		
		System.out.println(getLast(myArray));
		
		int[] newArr=getAllButFirst(myArray);
		printArray(newArr,", ");
		
		int[] myArray1 = {333, 22, 1, 400, 5005, 9}; 	
		System.out.println(getIndexOfMin(myArray1));
		
		System.out.println(getIndexOfMax(myArray));
		
		swapByIndex(myArray,1,4);
		printArray(myArray,", ");
		
		int[] myArray2 = {1, 22, 333, 400, 5005, 9}; 
		int[] newArr1=removeAtIndex(myArray2,3);
		printArray(newArr1,", ");
		
		int[] myArray3 = {1, 22, 333, 400, 9}; 
		int[] newArr2=insertAtIndex(myArray3,2, 777);
		printArray(newArr2,", ");
		
		int[] myArray4 = {22, 5005, 400, 333, 1, 9};
		System.out.println(isSorted(myArray4)); 
	}	
}