import java.util.ArrayList;
public class DailerPad
{
    public Contact searchContact(ArrayList<Contact> contactList,String num)
	{
		String[] numpad={"","ABC","DEF","DEF","JKL","MNO","PQRS","TUV","WXYZ"};
		for(int i=0;i<contactList.size();i++)
		{
			if(contactList.get(i).getFirstHalfPhoneNo().equals(num) || contactList.get(i).getSecondHalfPhoneNo().equals(num))
				return contactList.get(i);
		}
		for(int i=0;i<contactList.size();i++)
		{
			if(isMatched(contactList.get(i).getFirstName(),num))
				return contactList.get(i);
			if(isMatched(contactList.get(i).getLastName(),num))
				return contactList.get(i);
		}
		return null;
	}
	private boolean isMatched(String name,String num)
	{
		if(name=="" || name.length()!=num.length())
			return false;
		name=name.toUpperCase();
		for(int i=0;i<name.length();i++)
		{
			if(getNumFromNumpad(name.charAt(i))!=num.charAt(i))
				return false;
		}
		return true;
	}
	private char getNumFromNumpad(char ch)
	{
		if("ABC".contains(ch+""))
			return '2';
		if("DEF".contains(ch+""))
			return '3';
		if("GHI".contains(ch+""))
			return '4';
		if("JKL".contains(ch+""))
			return '5';
		if("MNO".contains(ch+""))
			return '6';
		if("PQRS".contains(ch+""))
			return '7';
		if("TUV".contains(ch+""))
			return '8';
		if("WXYZ".contains(ch+""))
			return '9';
		return '0';
	}
}