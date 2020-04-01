import java.util.ArrayList;
public class ArrayListCircle
{
	//Function to display arraylist
	public static void circleMethodsOfArrayList(ArrayList<Circle> arrli)
	{
		//Iterate over arraylist
		for (int i=0; i<arrli.size(); i++) 
		{
			//Print each element of arraylist
			System.out.println("Radius: "+arrli.get(i).getRadius()+" Area: "+arrli.get(i).getArea()+" "); 	
		}
	}
	public static void main(String[] args) 
	{
		//creation of arraylist of Cricle objects
		ArrayList<Circle> arrli = new ArrayList<Circle>();
		//Creating circle objects
		Circle circle1 = new Circle(7);
		Circle circle2 = new Circle(14);
		Circle circle3 = new Circle(21);
		//Adding  cricle objects to arraylist
		arrli.add(circle1);
		arrli.add(circle2);
		arrli.add(circle3);
		//Print arraylist
		System.out.print("\nCircle methods of Array list:\n");
		circleMethodsOfArrayList(arrli);
		//Remove circle1 from arraylist
		arrli.remove(circle1);
		System.out.print("\nCircle methods After deletion of circle1 whose radius is 7:\n");
		circleMethodsOfArrayList(arrli);

		Circle circle4 = new Circle(28);
		//Replace cricle2 with circle4
		arrli.set(arrli.indexOf(circle2),circle4);
		System.out.print("\nCircle methods After replacing circle object2 with circle4:\n");
		circleMethodsOfArrayList(arrli);
		
		Circle circle5 = new Circle(35);
		//Insert 21 at index 3
		arrli.add(1,circle5);
		System.out.print("\nArray list After inserting circle5 at index 1: \n");
		circleMethodsOfArrayList(arrli);
	}
}