import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner;

class HOP
{
	public static int findWinner(int child_count, int steps)
	{
		Queue<Integer> q = new LinkedList<>();
		//Add elements to queue
		for(int i=1;i<=child_count;i++)
		{
			q.add(i);
		}
		//Iterate until queue has only 1 element left
		while(q.size()>1)
		{
			//iterate for steps
			for(int i=0;i<steps;i++)
			{
				//Find the chilren
				int child = q.peek();
				//remove children
				q.remove();
				//add back to queue
				q.add(child);
			}
			//remove childre who has potato now
			q.remove();
		} 
		//return the only child left in queue
		return q.peek();
	}

	public static void main(String[] args) 
	{
		//User inputs and function calling
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of childrens: ");
		int child_count = scan.nextInt();
		System.out.print("Enter the numbér of steps: ");
		int steps = scan.nextInt();
		int winner=findWinner(child_count, steps);

		//Printing the outputs
		System.out.println("No of childrens:\t" + child_count);
		System.out.println("No of steps:\t" + steps);
		System.out.println("Winner:\t" + winner);	
	}	
}