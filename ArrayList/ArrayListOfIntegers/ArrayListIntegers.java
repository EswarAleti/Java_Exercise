import java.util.ArrayList;
public class ArrayListIntegers
{
	//Function to display arraylist
	public static void displayArrayList(ArrayList<Integer> arrli)
	{
		//Iterate over arraylist
		for (int i=0; i<arrli.size(); i++) 
		{
			//Print each element of arraylist
			System.out.print(arrli.get(i)+" "); 	
		}
	}
	public static void main(String[] args) 
	{
		//creation of arraylist
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		//adding elements from 10 to 19 into arraylist
		for(int i=0;i<10;i++)
		{
			arrli.add(i+10);
		}
		//Print arraylist
		System.out.print("\nElements of Array list: ");
		displayArrayList(arrli);
		//Remove 11 from arraylist
		arrli.remove(new Integer(11));
		System.out.print("\nArray list After deletion of 11: ");
		displayArrayList(arrli);
		//Replace element 12 with 4
		arrli.set(arrli.indexOf(12),4);
		System.out.print("\nArray list After replacing 12 with 4: ");
		displayArrayList(arrli);
		//Insert 21 at index 3
		arrli.add(3,21);
		System.out.print("\nArray list After inserting 21 at index 3: ");
		displayArrayList(arrli);	
	}
}