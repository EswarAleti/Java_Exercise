public class Main
{
	public static void main(String[] args) 
	{
		Car car=new Car("Lamborghini",8);
		car.startEngine();
		car.accelerate();
		car.brake();

		Audi audi=new Audi("Audi A3",10);
		audi.startEngine();
		audi.accelerate();
		audi.brake();

		Car car2=new Audi("Audi A5",12);
		car2.startEngine();
		car2.accelerate();
		car2.brake();
	}
}