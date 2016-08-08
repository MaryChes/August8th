package com.notes.monday;

public class KeithsCar 
{
	private int windows = 8;
	private int door = 5;
	private boolean runs = true;
	private String make = "Honda";
	private String model = "CRV";
	private String color = "red";
	private boolean currentlyRunning = false;
	
	//Use alt shift s and selecte generate constructor using fields to generate below :)
	public KeithsCar(int windows, int door, boolean runs, String make, String model, String color,
			boolean currentlyRunning) 
	{
		super();
		this.windows = windows;
		this.door = door;
		this.runs = runs;
		this.make = make;
		this.model = model;
		this.color = color;
		this.currentlyRunning = currentlyRunning;
	}

	public KeithsCar() 
	{
		super();
	}

	public int getWindows() 
	{
		return windows;
	}

	public int getDoor() 
	{
		return door;
	}

	public boolean isRuns() 
	{
		return runs;
	}

	public String getMake() 
	{
		return make;
	}

	public String getModel() 
	{
		return model;
	}

	public String getColor() 
	{
		return color;
	}

	public boolean isCurrentlyRunning() 
	{
		return currentlyRunning;
	}

	
	
	
	
	
	
	
	
}
