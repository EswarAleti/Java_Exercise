public class Circle 
{
	private int radius;

	public Circle(int r) 
	{
		radius = r;
	}

	public void setRadius(int r) 
	{
		r = radius;
	}

	public int getRadius() 
	{
		return radius;
	}

	public double getArea() 
	{
		return Math.PI  * Math.pow(radius, 2);
	}

	public boolean equals(Circle circle)
	{
		if(this==circle)
		{
			return true;
		}
		return false;
	}

}