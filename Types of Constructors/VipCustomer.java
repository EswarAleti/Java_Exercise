public class VipCustomer
{
	String name,email;
	double creditLimit;
	public VipCustomer()
	{
		this("defaultname","defaultname@hotmail.com",100000);
	}
	public VipCustomer(String name,String email)
	{
		this(name,email,100000);
	}
	public VipCustomer(String name, String email,int creditLimit)
	{
		this.name=name;
		this.email=email;
		this.creditLimit=creditLimit;
	}
	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
	public double getCreditLimit()
	{
		return this.creditLimit;
	}
}