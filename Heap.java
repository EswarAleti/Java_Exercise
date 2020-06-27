import java.util.Random;
public class Heap
{
	public static void main(String[] args) 
	{
		// Initialization of array with 15 elements
		int[] arr = new int[15];
		// Object creation for Random class 
		Random random = new Random();
		// Generating 15 random numbers into array
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = random.nextInt(50);
		}
		// Printing array content
		System.out.println("******Before building min-heap******");
		display(arr);
		// Building heap
		buildHeap(arr);
		System.out.println("\n******After building min-heap******");
		display(arr);
		// Sorting heap
		heapsort(arr);
		System.out.println("\n******After sorting heap******");
		display(arr);
	}
	public static void display(int[] arr)
	{
		// Display the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void heapify(int[] arr,int i, int heapSize)
	{
		// Left child
		int left = 2*i+1;
		// Right child
		int right = 2*i+2;
		// Initially assume that the smallest element is i
		int smallest = i;
		// If left child is smaller than parent
		if(left<heapSize && arr[left]<arr[smallest])
		{
			smallest = left;
		}
		// If right child is smaller than parent
		if(right<heapSize && arr[right]<arr[smallest])
		{
			smallest = right;
		}
		// If parent is not smallest
		if(smallest!=i)
		{
			// Swap parent with smallest
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			// Call heapify on smallest
			heapify(arr, smallest, heapSize);
		}
	}
	public static void buildHeap(int[] arr)
	{
		// heapSize is number of elements in array
		int heapSize = arr.length;
		// Call heapify from first non-left to root
		for(int i=arr.length/2;i>=0;i--)
		{
			heapify(arr, i, heapSize);
		}
	}	
	public static void heapsort(int[] arr)
	{
		int heapSize=arr.length;
		// Iterate until there is one element left in heap
		while(heapSize>0)
		{
			// Swap root with last element of heap
			int temp = arr[0];
			arr[0] = arr[heapSize-1];
			arr[heapSize-1] = temp;
			// Decrement size of heap
			heapSize--;
			// Call heapify on root
			heapify(arr,0,heapSize);
		}
	}
}