public class Contact
{
	private String firstName,lastName,firstHalfPhoneNo,secondHalfPhoneNo;
	public Contact(String firstName, String lastName, String firstHalfPhoneNo, String secondHalfPhoneNo)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.firstHalfPhoneNo=firstHalfPhoneNo;
		this.secondHalfPhoneNo=secondHalfPhoneNo;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getFirstHalfPhoneNo()
	{
		return this.firstHalfPhoneNo;
	}
	public String getSecondHalfPhoneNo()
	{
		return this.secondHalfPhoneNo;
	}
}