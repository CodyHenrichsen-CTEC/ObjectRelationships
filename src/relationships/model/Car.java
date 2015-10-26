package relationships.model;

public class Car extends Vehicle
{
	private double mpg;
	private String name;
	
	public Car()
	{
		this.mpg = 0;
		this.name = "";
	}

	public void move()
	{
		System.out.println("This is how a car moves.");
	}
	
	private void doesSomething()
	{
		
	}
	
	public String toString()
	{
		return "i am a car!";
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getMpg()
	{
		return mpg;
	}
	
	public void setMpg(double mpg)
	{
		this.mpg = mpg;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
