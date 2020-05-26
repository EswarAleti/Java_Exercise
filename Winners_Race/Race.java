// Importing Scanner class to take input from user
import java.util.Scanner;
public class Race
{
	public static void main(String[] args) 
	{
		int numOfRacers;
		// Creating object for Scanner class
		Scanner scanner = new Scanner(System.in);
		// Iterate until user enters valid input
		while(true)
		{
			// User input
			System.out.println("How many racers? (three is min and six is max)");	
			numOfRacers = scanner.nextInt();
			// Input validity checking
			if(numOfRacers<3 || numOfRacers>6)
			{
				System.out.println("Invalid input, Please try again...!");
				continue;
			}
			// If input is valid execution comes here
			double[] times = new double[6];
			// Input times
			System.out.println("Enter the race times (in seconds):");
			for(int i=0;i<numOfRacers;i++)
			{
				times[i] = scanner.nextDouble();
			}
			// Sort the times 
			sort(times, numOfRacers);
			// Print the sorted times
			System.out.print("Sorted race times... ");
			for(int i=0;i<6;i++)
			{
				System.out.print(times[i]+" ");
			}
			// Print the output
			System.out.println("\nFirst place (time in seconds): "+times[0]);
			System.out.println("Second place (time in seconds): "+times[1]);
			System.out.println("Third place (time in seconds): "+times[2]);
			break;
		}
	}
	// This method sort the times in asciding order
	public static void sort(double[] times, int numOfRacers)
	{
		// Bubble sort algorithm
		for(int i=0;i<times.length;i++)
		{
			for(int j=0;j<numOfRacers-i-1;j++)
			{
				if(times[j]>times[j+1])
				{
					double temp = times[j];
					times[j] = times[j+1];
					times[j+1] = temp; 
				}
			}
		}
	}
}	