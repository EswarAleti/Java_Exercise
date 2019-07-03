public class Hamburger
{
	private String name,meat,breadRollType;
	private double price;
	private String[] additionName={"Tomato","Lettus","Cheese","Egg","Chips","Drink"};
	private double[] additionPrice={10,5,15,20,20,50};
	private boolean[] isAdditionAdded={false,false,false,false,false,false};
	public Hamburger(String name, String meat, String breadRollType, double price)
	{
		this.name=name;
		this.meat=meat;
		this.breadRollType=breadRollType;
		this.price=price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void addHamburgerAddition(String addition)
	{
		for(int i=0;i<6;i++)
		{
			//System.out.println(addition);
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
