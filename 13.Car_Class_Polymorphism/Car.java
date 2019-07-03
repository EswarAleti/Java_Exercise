public class Car
{
	private boolean enigine;
	private int cylinders, wheels;
	private String name;
	public Car(String name, int cylinders)
	{
		this.enigine=true;
		this.cylinders=cylinders;
		this.wheels=4;
		this.name=name;
	}
	public boolean getEngine()
	{
		return this.enigine;
	}
	public int getCylinders()
	{
		return this.cylinders;
	}
	public int getWheels()
	{
		return this.wheels;
	}
	public String getName()
	{
		return this.name;
	}
	public void startEngine()
	{
		System.out.println(this.name+" -> startEngine()");
	}
	public void accelerate()
	{
		System.out.println(this.name+" -> accelerate()");
	}
	public void brake()
	{
		System.out.println(this.name+" -> brake()");
	}
}