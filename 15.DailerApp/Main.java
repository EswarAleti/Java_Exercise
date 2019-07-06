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

		DailerPad dailerPad=new DailerPad();
		Contact resultContact=dailerPad.searchContact(contactList,"7488");
		if(resultContact==null)
		{
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name: "+resultContact.getFirstName()+" "+resultContact.getLastName());
		System.out.println("Contact: "+resultContact.getFirstHalfPhoneNo()+" "+resultContact.getSecondHalfPhoneNo());
	}
}