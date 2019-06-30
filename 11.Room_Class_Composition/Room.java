public class Room
{
	private Furniture furniture;
	private Electronics electronics;
	public Room(Furniture furniture,Electronics electronics)
	{
		this.furniture=furniture;
		this.electronics=electronics;
	}
	public void getFurnitureDetails()
	{
		System.out.println("Name of Furniture: "+getFurniture().getName());
		System.out.println("Company: "+getFurniture().getCompany());
		System.out.println("Use: "+getFurniture().getUse());
		System.out.println("Cost: "+getFurniture().getCost());
	}
	private Furniture getFurniture()
	{
		return furniture;
	}
	public Electronics getElectronics()
	{
		return electronics;
	}
}