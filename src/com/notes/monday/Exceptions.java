package com.notes.monday;

public class Exceptions 
{

	public static void main(String[] args) 
	{
		int[] hiya = new int[1];
		try
		{
		System.out.println(hiya[2]);
		}
		catch (ArrayIndexOutOfBoundsException alienEggs) 
		{
			System.out.println("You made some error");
		}//make sure error in catch actually matches what is happening
		
	}

}
