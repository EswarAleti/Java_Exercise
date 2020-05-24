import java.util.Scanner;
class ArrayDemo
{
	public static void main(String[] args) 
	{
		int[][] inStock = new int[10][14];
		int[] alpha = new int[20];
		int[] beta = new int[20];
		int[] gamma = {11, 13, 15, 17};
		int[] delta = {3, 5, 2, 6, 10, 9, 7, 11, 1, 8};

		// Method calling and testing
		inputArray(alpha);
		System.out.println("Elements of array alpha:");
		printArray(alpha);
		doubleArray(alpha,beta);
		System.out.println("Elements of array beta:");
		printArray(beta);
		copyGamma(inStock,gamma);
		System.out.println("Elements of array inStock:");
		printInStock(inStock);
		copyAlphaBeta(inStock,alpha,beta);
		System.out.println("Elements of array inStock:");
		printInStock(inStock);
		setInStock(inStock,delta);
		System.out.println("Elements of array inStock:");
		printInStock(inStock);
	}

	public static void inputArray(int[] alpha)
	{
		// Creation of object to Scanner class
		Scanner scanner = new Scanner(System.in);
		// Promt user for 20 numbers
		System.out.println("Enter 20 numbers: ");
		// Take 20 inputs from user
		for(int i=0;i<20;i++)
		{
			// Store number into alpha at index i
			alpha[i] = scanner.nextInt();		
		}
	}

	public static void doubleArray(int[] alpha, int[] beta)
	{
		// Double the element of alpha and store into beta
		for(int i=0;i<20;i++)
		{
			beta[i] = 2*alpha[i];
		}
	}
	public static void copyGamma(int[][] inStock, int[] gamma)
	{
		// Since gamma has only 4 elements we should repeat the gamma
		for(int i=0;i<14;i++)
		{
			inStock[0][i] = gamma[i%4];
		}
		for(int i=1;i<10;i++)
		{
			// Current row should be 3 times to the previous row
			for(int j=0;j<14;j++)
			{
				inStock[i][j] = inStock[i-1][j]*3;
			}
		}
	}
	public static void copyAlphaBeta(int[][] inStock, int[] alpha, int[] beta)
	{
		// First 5 rows are element of alpha
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<14;j++)
			{
				inStock[i][j] = alpha[j];
			}
		}
		// Last 5 rows are element of beta
		for(int i=5;i<10;i++)
		{
			for(int j=0;j<14;j++)
			{
				inStock[i][j] = beta[j];
			}
		}
	}
	public static void printArray(int[] arr)
	{
		int index=0;
		while(index<arr.length)
		{
			// Print 15 elements
			for(int i=0;i<15 && index<arr.length;i++)
			{
				System.out.print(arr[index]+" ");
				index++;
			}
			// Print new line
			System.out.println();
		}
	}
	public static void setInStock(int[][] inStock, int[] delta)
	{
		// Creation of object to Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		// Take elements for first column
		for(int i=0;i<10;i++)
		{
			inStock[i][0] = scanner.nextInt();
		}
		// Each column is 2 times of previous column minus corresponding element in delta
		for(int j=1;j<14;j++)
		{
			for(int i=0;i<10;i++)
			{
				inStock[i][j] = inStock[i][j-1]*2 - delta[i];
			}
		}
	}

	// This method will print the InStock
	public static void printInStock(int[][] inStock)
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<14;j++)
			{
				System.out.print(inStock[i][j]+" ");
			}
			System.out.println();
		}
	}
}