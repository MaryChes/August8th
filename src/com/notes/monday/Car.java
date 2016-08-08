package com.notes.monday;

public class Car 
{
	private int windows = 0;
	private int door = 0;
	private boolean runs = false;
	private String make = null;
	private String model = null;
	private String color = null;
	private boolean currentlyRunning = false;
	
	
	
	public Car(int windows, int door, boolean runs, String make, String model, String color, boolean currentlyRunning) {
		super();
		this.windows = windows;
		this.door = door;
		this.runs = runs;
		this.make = make;
		this.model = model;
		this.color = color;
		this.currentlyRunning = currentlyRunning;
	}
	public int getWindows() 
	{
		return windows;
	}
	public void setWindows(int windows) 
	{
		this.windows = windows;
	}
	public int getDoor() 
	{
		return door;
	}
	public void setDoor(int door) 
	{
		this.door = door;
	}
	public boolean isRuns() 
	{
		return runs;
	}
	public void setRuns(boolean runs) 
	{
		this.runs = runs;
	}
	public String getMake() 
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColore(String color) 
	{
		this.color = color;
	}
	public boolean isCurrentlyRunning() 
	{
		return currentlyRunning;
	}
	public void setCurrentlyRunning(boolean currentlyRunning) 
	{
		this.currentlyRunning = currentlyRunning;
	}
	
}
