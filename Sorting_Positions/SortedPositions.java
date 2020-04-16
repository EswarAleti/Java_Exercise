public class SortedPositions
{
	public static void main(String[] args) 
	{
		//Array A initialization
		int[] A={4,9,1,5};
		//Array of IntKVPair objects declaration of size of array A
		IntKVPair[] arrOfObj=new IntKVPair[A.length];
		//Create object with key as A[i] and value as i
		for(int i=0;i<A.length;i++)
		{
			arrOfObj[i]=new IntKVPair(A[i],i);
		}
		//Sort arrOfObj using mergesort which take O(nlogn) time
		mergesort(arrOfObj,0, arrOfObj.length-1);
		
		//Array B contains indices
		int[] B=new int[arrOfObj.length];
		//For each element of A
		for(int i=0;i<B.length;i++)
		{
			//Get index of element A[i] using binarySearch which take O(logn) time
			B[i]=binarySearch(arrOfObj,0,arrOfObj.length,A[i]);
		}
		//Total time O(nlogn) + O(nlogn) = O(nlogn)
		//Print array B
		for(int i=0;i<B.length;i++)
		{
			System.out.print(B[i]+" ");
		}
	}

	//This method will return index of key in arr[]
	public static int binarySearch(IntKVPair arr[],int l, int r, int key)
	{
		if(l<=r)
		{
			//middle
			int m=(l+r)/2;
			//If key found return m
			if(arr[m].getKey()==key)
			{
				return m;
			}
			//If key is lesser go to left subpart
			if(arr[m].getKey()>key)
			{
				return binarySearch(arr, l,m-1,key);
			}
			//goto right subpart
			return binarySearch(arr, m+1,r,key);
		}
		return -1;
	}

	//Standard merge sort
	public static void mergesort(IntKVPair arr[], int l, int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			mergesort(arr,l,m);
			mergesort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}	

	//Standard merge
	public static void merge(IntKVPair arr[], int l, int m, int r)
	{
		int n1=m-l+1;
		int n2 = r-m;

		IntKVPair L[] = new IntKVPair[n1];
		IntKVPair R[] = new IntKVPair[n1];

		for(int i=0;i<n1;i++)
		{
			L[i] = arr[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			R[i] = arr[m+i+1];
		}

		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i].getKey()<R[j].getKey())
			{
				arr[k++]=L[i++];
			}
			else
			{
				arr[k++]=R[j++];
			}
		}
		while(i<n1)
		{
			arr[k++]=L[i++];
		}
		while(j<n2)
		{
			arr[k++]=R[j++];
		}
	}
}