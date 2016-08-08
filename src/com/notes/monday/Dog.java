package com.notes.monday;

public class Dog 
{
	private String breed = null;

	public String getBreed() 
	{
		return breed;
	}

	public void setBreed(String breed) 
	{
		this.breed = breed;
	}
	
	public Dog(String name)
	{
		super();
		this.breed = name;
	}
}
