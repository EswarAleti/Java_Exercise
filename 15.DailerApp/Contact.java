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
	public boolean isNumberMatch(String num)
	{
		return  firstHalfPhoneNo.equals(num) || secondHalfPhoneNo.equals(num);
	}
	private boolean isMatch(String name,String num)
	{
		if(name=="" || name.length()!=num.length())
			return false;
		for(int i=0;i<name.length();i++)
		{
			if(DailerPad.getNumFromNumpad(name.charAt(i))!=num.charAt(i))
				return false;
		}
		return true;
	}
	public boolean isNameMatch(String num)
	{
		return isMatch(firstName.toUpperCase(),num)||isMatch(lastName.toUpperCase(),num);
	}
}