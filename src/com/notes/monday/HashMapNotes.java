package com.notes.monday;

import java.util.HashMap;

public class HashMapNotes
{
	public static void main(String[] args) 
	{
		HashMap cars = new HashMap();
		cars.put("Sonic", "Chevy");
		cars.put("F-150", "Ford");
		cars.put("F-250", "Ford");
		System.out.println(cars.get("F-150"));
		System.out.println(cars.get("Chevy"));
		System.out.println(cars.get(""));
		
	
		
		
		
		
		
		
	}
	//HashMap stores a key value pair.
//"sonic", "Chevy"
//key		value
//"Malibu","Chevy"
//"F-150", "Ford"
//"F-250, "Ford"
//The key should be the more limiting of the two values
}
