public class BankAccount
{
	private String accountNumber,customerName,email,phoneNumber;
	private double balance;
	public BankAccount(String accountNumber, String customerName, String email, String phoneNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
	}
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	public String getCustomerName()
	{
		return this.customerName;
	}
	public String getEmail()
	{
		return this.email;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void depositFunds(double depositAmount)
	{
		this.balance +=depositAmount;
		System.out.println("Amount deposited: "+depositAmount);
		System.out.println("Available balance is: "+this.balance);
	}
	public void withdrawFunds(double withdrawlAmount)
	{
		if(withdrawlAmount<=balance)
		{
			balance -=withdrawlAmount;
			System.out.println("Amount withdrawn: "+withdrawlAmount);
			System.out.println("Available balance is: "+this.balance);
		}
		else
		{
			System.out.println("Insufficient Funds");
			System.out.println("Available balance is: "+this.balance);
		}
	}
}