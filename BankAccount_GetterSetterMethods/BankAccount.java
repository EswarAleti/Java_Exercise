public class BankAccount
{
	private String accountNumber,customerName,email,phoneNumber;
	private double balance;
	public void setAccountNumber(String var)
	{
		this.accountNumber=var;
	}
	public void setCustomerName(String var)
	{
		this.accountNumber=var;
	}	
	public void setEmail(String var)
	{
		this.email=var;
	}
	public void setPhoneNumber(String var)
	{
		this.phoneNumber=var;
	}
	public void setBalance(double var)
	{
		this.balance=var;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public double getBalance()
	{
		return balance;
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