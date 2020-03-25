import java.util.ArrayList;
import java.util.Scanner;
public class Demo
{
	//Create clock from user
	public static Clock1 getClockFromUser()
	{	
		//User input using scanner class
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter time (hh mm ss merdiem) e.g. 10 23 56 am: ");
		int hr = scanner.nextInt();
		int min = scanner.nextInt();
		int sec = scanner.nextInt();
		String merdiem = scanner.next();
		//Create clock object
		Clock1 clock=new Clock1();
		//set time
		clock.setTime(hr,min,sec,merdiem);
		//return the clock
		return clock;
	}

	public static void clockBeforeNoon(ArrayList<Clock1> arr)
	{
		System.out.println("Clock before noon: ");
		for(int i=0;i<arr.size();i++)
		{
			//If meridiem is am then print it
			if(arr.get(i).getMeridiem().equals("am"))
			{
				System.out.println(arr.get(i).toString());
			}
		}
	}

	public static ArrayList<Clock1> clockAfterNoon(ArrayList<Clock1> arr)
	{
		//New ArrayList which stores clock which are after noon
		ArrayList<Clock1> afterNoonArr = new ArrayList<Clock1>();
		for(int i=0;i<arr.size();i++)
		{
			//If meridiem is pm then add clock to new array
			if(arr.get(i).getMeridiem().equals("pm"))
			{
				afterNoonArr.add(arr.get(i));
			}
		}
		//return new arraylist
		return afterNoonArr;
	}

	public static void removeAfterTenPM(ArrayList<Clock1> arr)
	{	
		for(int i=0;i<arr.size();i++)
		{
			//remove if meridiem is pm and time after 10
			if(arr.get(i).getMeridiem().equals("pm") && arr.get(i).getHr()>=10 && (arr.get(i).getMin()>0 || arr.get(i).getSec()>0))
			{
				arr.remove(i);
				//decrememt index because array will be left shifted
				i--;
			}
		}
	}

	//method to print arraylist
	public static void printArrayList(ArrayList<Clock1> arr)
	{
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i).toString());
		}
	}

	public static void main(String[] args) 
	{
		//Function callings
		ArrayList<Clock1> arr = new ArrayList<Clock1>();
		for(int i=0;i<5;i++)
		{
			arr.add(getClockFromUser());
		}
		clockBeforeNoon(arr);

		System.out.println("Clock after noon: ");
		ArrayList<Clock1> afterNoonArr=clockAfterNoon(arr);
		printArrayList(afterNoonArr);

		System.out.println("After Removing clocks after 10 pm");
		removeAfterTenPM(arr);
		printArrayList(arr);
	}
}