import java.util.Scanner;
class Stock
{
	public static void main(String[] args) 
	{
		//User input for M and N
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter value of M: ");	
		int M = scanner.nextInt();
		System.out.print("Enter value of N: ");	
		int N = scanner.nextInt();
		//Condition validation
		if(M<=N+4)
		{
			System.out.println("Invalid values of M,N: M>N+4 should be satisfied");
			return;
		}

		//stockArr stores recent N prices
		double[] stockArr=new double [N];
		//Average array stores the averages
		double[] avgArr=new double [M-N+1];
		//index is for avgr=Arr
		int index=0;

		//Initial sum is 0
		double sum=0;
		System.out.print("Enter stocks: ");
		//First N prices
		for(int i=0;i<N;i++)
		{
			stockArr[i]=scanner.nextDouble();
			sum+=stockArr[i];
		}
		//Find average and add it to avgArr
		avgArr[index++]=sum/N;
		//Remaining M-N prices
		for(int i=N;i<M;i++)
		{
			//subtract first price of stockArr
			sum-=stockArr[0];
			//shift left the array
			shiftLeftArray(stockArr);
			stockArr[N-1]=scanner.nextDouble();
			//add new price 
			sum+=stockArr[N-1];
			//Find new average and add it to avgArr
			avgArr[index++]=sum/N;
		}

		//Print the averages
		System.out.print("Averages are: ");
		for(int i=0;i<avgArr.length;i++)
		{
			System.out.print(Math.round(avgArr[i] * 100.0) / 100.0 + " ");
		}
	}
	//method to shoft the array to left by 1 index
	public static void shiftLeftArray(double[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
	}
}