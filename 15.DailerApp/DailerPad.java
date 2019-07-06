import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Map; 
public class DailerPad
{
    public Contact searchContact(ArrayList<Contact> contactList,String num)
	{
		for(int i=0;i<contactList.size();i++)
		{
			if(contactList.get(i).isNumberMatch(num) || contactList.get(i).isNameMatch(num))
			{
				return contactList.get(i);
			}
		}
		return null;
	}
	public static char getNumFromNumpad(char ch)
	{
		String[][] numPad={{"ABC","2"},{"DEF","3"},{"GHI","4"},{"JKL","5"},{"MNO","6"},{"PQRS","7"},{"TUV","8"},{"WXYZ","9"}};
		for(int i=0;i<numPad.length;i++)
		{
			if (numPad[i][0].contains(ch+"")) 
			{
				return numPad[i][1].charAt(0);
			}
		}
		return '0';
	}
}