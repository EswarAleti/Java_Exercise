public class Main
{
	public static void main(String[] args) 
	{
		Hamburger hamburger=new Hamburger("Regular","Chicken","White",90);
		System.out.println("Initial Price of burger:"+hamburger.getPrice());
		hamburger.addHamburgerAddition("Tomato");
		hamburger.addHamburgerAddition("Lettuce");
		hamburger.addHamburgerAddition("Cheese");
		System.out.println("Total burger price is: "+hamburger.getPrice());

		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 150);
		System.out.println("Initial Price of burger:"+healthyBurger.getPrice());
		healthyBurger.addHealthyBurgerAddition("Lentils"); 
		healthyBurger.addHealthyBurgerAddition("Beens");
		System.out.println("Total burger price is: "+healthyBurger.getPrice());	

		DeluxeBurger deluxeBurger = new DeluxeBurger();	
		deluxeBurger.addHamburgerAddition("Egg");
		System.out.println("Total burger price is: "+deluxeBurger.getPrice()); 
	}
}