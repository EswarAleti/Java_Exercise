//Importing scanner class
import java.util.Scanner;
public class Demo
{
	public static void main(String[] args) 
	{
		//Creating song1 object with default constructor
		Song song1=new Song();
		//setting detials of song1
		song1.setTitle("Your heart...!");
		song1.setDuration(3.5);

		//creating song2 object 
		Song song2=new Song("Good Time",3.5);

		//Creating song3 object with song2 as parameter
		Song song3=new Song(song2);	
		
		//Creating object for scanner class
		Scanner scanner=new Scanner(System.in);	
		//User input for N
		System.out.print("Enter value N: ");
		int N=scanner.nextInt();
	
		//Creating array for objects of class Song
		Song[] songs=new Song[N];
		double dur;
		String s;
		System.out.println("Enter song details: ");
		//Take N song details
		for(int i=0;i<N;i++)
		{
			//Two nextLine() one will take \n character another take title
			s = scanner.nextLine();
			s = scanner.nextLine();
			dur = scanner.nextDouble();
			//Creatin object
			Song ssong=new Song(s,dur);
			//Storing in songs array
			songs[i]=ssong;
		}

		//Calculate totalDuration
		double totalDuration=0;
		for(int i=0;i<N;i++)
		{
			totalDuration+=songs[i].getDuration();
		}
		//output
		System.out.printf("Total duration: %.2f\n", totalDuration);

		System.out.println("Song title whose duration is less than or equal to 2 minutes:");
		for(int i=0;i<N;i++)
		{
			//If duration is less than or equal to 2 then print song title
			if(songs[i].getDuration()<=2)
			{
				System.out.println(songs[i].getTitle());
			}
		}
	}
}