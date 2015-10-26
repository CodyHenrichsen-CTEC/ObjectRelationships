package relationships.controller;

import java.util.ArrayList;

import relationships.model.*;
import relationships.view.PopupView;

public class RelationshipController
{
	private PopupView display;
	private Vehicle tempVehicle;
	private Plane myPlane;
	private Car myCar;
	private SUV mySUV;
	
	public RelationshipController()
	{
		display = new PopupView();
	}
	
	public void start()
	{
//		showOverriddenMethods();
//		showInstanceOf();
		showPolymorphism();
//		showInheritedMethods();
		
	}
	
	private void showPolymorphism()
	{
		ArrayList<Vehicle> myList= new ArrayList<Vehicle>();
		myList.add(new Car());
		myList.add(new Plane());
		myList.add(new SUV());
		myList.add(new Plane());
		myList.add(new SUV());
		
		display.displayContents("There are "+ myList.size() + " vehicles in the list");
		
		Vehicle tempVehicle = myList.get(2);
		tempVehicle.move();
		Car tempCar = (Car) tempVehicle;
		tempCar.move();
		SUV tempSUV = (SUV) tempCar;
		tempSUV.move();
	}

	private void showInstanceOf()
	{
		myPlane = null;
		//myPlane is not initialized!
		if(myPlane instanceof Vehicle)
		{
			display.displayContents("An instance of the Vehicle type");
		}
		else
		{
			display.displayContents("Not an instance of the Vehicle type");
		}
		myPlane = new Plane();
		if(myPlane instanceof Vehicle)
		{
			display.displayContents("An instance of the Vehicle type");
		}
		else
		{
			display.displayContents("Not an instance of the Vehicle type");
		}
		if(myPlane instanceof Plane)
		{
			display.displayContents("An instance of the Plane type");
		}
		else
		{
			display.displayContents("Not an instance of the Plane type");
		}
		
	}
	
	private void showInheritedMethods()
	{
		SUV mySUV = new SUV();
		display.displayContents("The SUV has an MPG of: " + mySUV.getMpg());
	}
	
	private void showOverriddenMethods()
	{
		Plane myPlane = new Plane();
		Vehicle temp = (Vehicle) myPlane;
		display.displayContents("Plane version of .toString()" + myPlane.toString());
		display.displayContents("Vehicle version of .toString()" + temp.toString());
	}
}
