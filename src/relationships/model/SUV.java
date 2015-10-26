package relationships.model;

public class SUV extends Car
{
	public SUV()
	{
		super(); // Must be the first line of the constructor!
		setMpg(0.7); // Calling the public method of the super class
		setName("Mega Car");
	}
	
	public void move()
	{
		System.out.println("Parent method first");
		super.move();
		System.out.println("Now do local instructions");
	}
	
	public String toString()
	{
		//super.methodCall() can happen as needed - order is not important.
		String info = getName() + " " + super.toString()  +  " and an SUV!";
		return info;
	}
	
	public void specialSUVAction()
	{
		//Does nothing :D
	}
}
