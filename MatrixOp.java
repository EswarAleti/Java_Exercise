/*
Note: 
System.out.printf("%.2f,",val);
Above statement is used to round the value val to two decimal places
*/
class MatrixOp
{
	public static void main(String[] args) 
	{
		//2-D array initialization
		double[][] inputArr = {	{4.3,2.7,8.5,3.2,9.8},
							   	{7.4,5.6,3.7,5.8,1.3},
							   	{9.5,6.4,8.1,4.9,0.6},
							   	{0.8,5.7,2.3,3.6,7.8},
							   	{3.9,6.2,5.5,7.8,2.3}};
		//displayMatrix function calling		
		displayMatrix(inputArr);

		//Dimension of array
		int n=inputArr.length;
		
		//rowSum() function calling
		double[] rowArr = rowSum(inputArr);
		System.out.print("row sum: ");
		for(int i=0;i<n-1;i++)
		{
			System.out.printf("%.2f,",rowArr[i]);
		}
		//Print last element here to avoid ,
		System.out.printf("%.2f\n",rowArr[n-1]);
		
		//colSUm() function calling
		double[] colArr = colSum(inputArr);
		System.out.print("column sum: ");
		for(int i=0;i<n-1;i++)
		{
			System.out.printf("%.2f,",colArr[i]);
		}
		//Print last element here to avoid ,
		System.out.printf("%.2f\n",colArr[n-1]);

		//getTrace() function calling
		double trace = getTrace(inputArr);
		System.out.printf("Trace: %.2f\n",trace);
	}	
	public static void displayMatrix(double[][] inputArr)
	{
		//Dimension of array
		int n=inputArr.length;
		//For each row
		for(int i=0;i<n;i++)
		{
			//For each column
			for(int j=0;j<n;j++)
			{
				//Except last element add , after all elements
				if(j!=n-1)
				{
					System.out.print(inputArr[i][j]+",");
				}
				//Don't print , to last element of row
				else
				{
					System.out.print(inputArr[i][j]);
				}
			}
			//Print new line after each row
			System.out.println();
		}
	}
	public static double[] rowSum(double[][] inputArr)
	{
		//Dimension of array
		int n=inputArr.length;
		//Creating array to store sum of elements of each row
		double[] rowArr=new double[n];
		//For each row
		for(int i=0;i<n;i++)
		{
			//for each row initial sum is 0
			double sum=0;
			//for each column
			for(int j=0;j<n;j++)
			{
				//add element to sum
				sum+=inputArr[i][j];
			}
			//insert sum into array
			rowArr[i]=sum;
		}
		//return array
		return rowArr;
	}
	public static double[] colSum(double[][] inputArr)
	{
		//Dimesion of array
		int n=inputArr.length;
		//Creating array to store sum of elements of each columns
		double[] colArr=new double[n];
		//For each row
		for(int i=0;i<n;i++)
		{
			//For every column initial sum is 0
			double sum=0;
			//For each columns
			for(int j=0;j<n;j++)
			{
				//add inputArr[j][i] to sum
				sum+=inputArr[j][i];
			}
			//insert sum into array
			colArr[i]=sum;
		}
		//return array
		return colArr;
	}

	public static double getTrace(double[][] inputArr)
	{
		//Trace is sum of diagonal elements
		//Dimension of array
		int n=inputArr.length;
		//Initial trace is 0
		double trace=0;
		//For each diagonal element
		for(int i=0;i<n;i++)
		{
			//Add diagonal element to trace
			trace+=inputArr[i][i];
		}
		//return trace
		return trace;
	}
}