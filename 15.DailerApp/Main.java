import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		Contact contact1=new Contact("Keanu","Reeves","96857","68789");
		contactList.add(contact1);
		Contact contact2=new Contact("Brad","Pitt","96877","83421");
		contactList.add(contact2);
		Contact contact3=new Contact("Trisha","","97432","74880");
		contactList.add(contact3);
		Contact contact4=new Contact("Vijay","Sethupathy","99490","83597");
		contactList.add(contact4);

		Contact resultContact=searchContact(contactList,"74880");
		if(resultContact==null)
		{
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name: "+resultContact.getFirstName()+" "+resultContact.getLastName());
		System.out.println("Contact: "+resultContact.getFirstHalfPhoneNo()+" "+resultContact.getSecondHalfPhoneNo());
	}
	public static Contact searchContact(ArrayList<Contact> contactList,String num)
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
	public static boolean isMatched(String name,String num)
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
	public static char getNumFromNumpad(char ch)
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