public class Main
{
	public static void main(String[] args) 
	{
		VipCustomer cust1=new VipCustomer();
		System.out.println("Name: "+cust1.getName()+"\nEmail: "+cust1.getEmail()+"\nCredit Limit: "+cust1.getCreditLimit());
		VipCustomer cust2=new VipCustomer("John","John@gmail.com");
		System.out.println("Name: "+cust2.getName()+"\nEmail: "+cust2.getEmail()+"\nCredit Limit: "+cust2.getCreditLimit());
		VipCustomer cust3=new VipCustomer("John","John@gmail.com",123456);
		System.out.println("Name: "+cust3.getName()+"\nEmail: "+cust3.getEmail()+"\nCredit Limit: "+cust3.getCreditLimit());
	}
}