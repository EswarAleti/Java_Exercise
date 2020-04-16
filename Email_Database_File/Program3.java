import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
public class Program3
{
	public static void main(String[] args)throws IOException 
	{
		FileReader fr=new FileReader("p3.txt");
		BufferedReader br=new BufferedReader(fr);
		
		ArrayList<String> names=new ArrayList<String>();
		ArrayList<String> emails=new ArrayList<String>();
		ArrayList<String> passwords=new ArrayList<String>();

		String s;
		while((s=br.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(s);
			names.add(st.nextToken());
			emails.add(st.nextToken());
			passwords.add(st.nextToken());
		}
		br.close();
		fr.close();

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your email address (q to quit)");
		while(true)
		{
			String email=scanner.next();
			if(email.equals("q"))
			{
				System.out.println("Good Bye!");
				break;
			}
			int position = searchEmail(emails,email);
			if(position==-1)
			{
				System.out.println("Email not found, please try again (q to quit):");
				continue;
			}
			System.out.println("Enter your password: ");
			for(int i=0;i<3;i++)
			{
				String password=scanner.next();
				if(password.equals(passwords.get(position)))
				{
					System.out.println("Welcome "+names.get(position)+"!  Do you want to change your password (y/n)?");
					String choice = scanner.next();
					if(choice.equals("n") || choice.equals("N"))
					{
						System.out.println("Thank you, Good Bye!");
						return;
					}
					else
					{
						System.out.println("Enter new password:");
						String newPassword = scanner.next();
						passwords.set(position,newPassword);
						System.out.println("Your password has been updated.");
						return;
					}
				}
				else if(i<2)
				{
					System.out.println("Password incorrect, pelase try again:");
				}
				else
				{
					System.out.println("Password incorrect. 3 strikes, locked out!");
					return;
				}
			}
		}
	}

	public static int searchEmail(ArrayList<String> emails,String email)
	{
		for(int i=0;i<emails.size();i++)
		{
			if(email.equals(emails.get(i)))
			{
				return i;
			}
		}
		return -1;
	}	
}