package relationships.model;

public class Plane extends Vehicle implements Flyer
{
	/**
	 * Method required to be implemented from Vehicle abstract class.
	 */
	public void move()
	{
		
	}
	
	/**
	 * 
	 * Required method from Flyer interface.
	 */
	public double liftCapacity()
	{
		return Double.NaN;
	}
	
	/**
	 * 
	 * Required method from Flyer interface.
	 */
	public void takeOff()
	{
		
	}
	
	/**
	 * 
	 * Required method from Flyer interface.
	 */
	public void land()
	{
		
	}
	
	/**
	 * Overridden toString method from Vehicle
	 */
	public String toString()
	{
		String info = super.toString() +" This is a plane object :D";
		return info;
	}

}
