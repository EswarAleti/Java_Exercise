public class DeluxeBurger extends Hamburger
{
	public DeluxeBurger()
	{
		super("Deluxe", "Mutton","White",170);
        super.addHamburgerAddition("Chips");
        super.addHamburgerAddition("Drink");
	}
	public void addHamburgerAddition(String addition)
	{
		System.out.println("Cannot add any thing");
	}	
}