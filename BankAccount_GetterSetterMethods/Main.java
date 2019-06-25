public class Main
{
	public static void main(String[] args) 
	{
		BankAccount johnAcc =new BankAccount();
		johnAcc.setAccountNumber("12345678910");
		//johnAcc.withdrawFunds(123456);
		johnAcc.setBalance(12345);
		johnAcc.setCustomerName("John");
		johnAcc.setEmail("John@hotmail.com");
		johnAcc.setPhoneNumber("1234567890");
		johnAcc.withdrawFunds(123456);
	}
}