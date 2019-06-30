public class Electronics
{
	private String name;
	private String use;
	private String company;
	private double cost;
	public Electronics(String name, String company,String use, double cost)
	{
		this.name=name;
		this.use=use;
		this.cost=cost;
		this.company=company;
	}
	public String getName()
	{
		return name;
	}	
	public String getUse()
	{
		return use;
	}
	public String getCompany()
	{
		return company;
	}
	public double getCost()
	{
		return cost;
	}
}