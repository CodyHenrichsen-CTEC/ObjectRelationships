package relationships.model;

/**
 * Example abstract class to show relationships between
 * parent and subclass objects. 
 * @author Cody Henrichsen
 * @version 1.0 10/15/16
 */
public abstract class Vehicle
{	
	/**
	 * Inaccessible data member without a getter method. 
	 */
	private int someNumber;
	
	/**
	 * Constructor just initializes the data member. 
	 * Cannot be called externally.
	 */
	public Vehicle()
	{
		this.someNumber = 6;
	}
	
	/**
	 * Empty method prototype. This method MUST be implemented 
	 * in all subclasses. You cannot make it private. 
	 * Notice that there is a lack of squiggles 
	 * and a semicolon after the header. This is the indication that
	 * it is a prototype of a method.
	 */
	public abstract void move();
	
	/**
	 * Implemented method for superclass. 
	 * Will most likely be overridden in the subclass(es).
	 */
	public String toString()
	{
		return "base level Vehicle";
	}
}