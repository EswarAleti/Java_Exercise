public class Benz extends Car
{
	public Benz(String name, int cylinders)
	{
		super(name,cylinders);
	}
	public void startEngine()
	{
		System.out.println(getName()+" -> startEngine()");
	}
	public void accelerate()
	{
		System.out.println(getName()+" -> accelerate()");
	}
	public void brake()
	{
		System.out.println(getName()+" -> brake()");
	}
}