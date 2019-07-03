public class HealthyBurger extends Hamburger
{
	private String[] additionName={"Lentils","Beens"};
	private double[] additionPrice={15,25};
	private boolean[] isAdditionAdded={false,false,false,false};
	private double price;
	public HealthyBurger(String meat,double price)
	{
		super("Healthy",meat,"Brown Rye",price);
		this.price=super.getPrice();
	}
	public double getPrice()
	{
		return this.price;
	}
	public void addHealthyBurgerAddition(String addition)
	{
		super.addHamburgerAddition(addition);
		double price=super.getPrice();
		for(int i=0;i<2;i++)
		{
			if(additionName[i].equals(addition))
			{
				if(isAdditionAdded[i]==true)
				{
					System.out.println(addition + " of price "+additionPrice[i]+" has already added.");
					break;
				}	
				System.out.println(addition + " of price "+additionPrice[i]+" has been added.");
				this.price +=additionPrice[i];
				this.isAdditionAdded[i]=true;
			}
		}
	}
}