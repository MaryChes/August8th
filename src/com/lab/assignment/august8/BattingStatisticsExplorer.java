package com.lab.assignment.august8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BattingStatisticsExplorer 
{
	public static void main(String[] args) 
	{
		float sumOfBasesFromAtBats = 0;
		float battingAverage = 0;
		float sluggingPercentage = 0;
		float totalHits = 0;
		
		ArrayList<Float> atBatNumbersList = new ArrayList<>();
		
		Scanner scNumberOfAtBats = new Scanner(System.in);
		Scanner scNumberOfBases = new Scanner(System.in);
		System.out.println();
		System.out.println("\n Welcome to the Baseball Statistics Calculator."
					+ "\n \n We will use the data you input to calculate a player's "
					+ "\n batting average and slugging percentage."
					+ "\n Please enter the number of at-bats for the player");
					
		String numberOfAtBats = scNumberOfAtBats.nextLine();
		float numberOfAtBatsAsFloat = Float.parseFloat(numberOfAtBats);
		
		
		System.out.println("How many bases were taken at each 'at-bat'?"
						+ "\n\t Out = 0"
						+ "\n\t Single = 1"
						+ "\n\t Double = 2"
						+ "\n\t Triple = 3"
						+ "\n\t Homerun = 4");
		System.out.println();
			
		for (int i = 0; i < numberOfAtBatsAsFloat; i++) 
		{
		System.out.println("Bases for At-Bat " + (i + 1 ) + ":");
		String numberOfBases = scNumberOfBases.nextLine();
		float numberOfAtBasesAsFloat = Float.parseFloat(numberOfBases);

		atBatNumbersList.add(numberOfAtBasesAsFloat);
		}
		
		System.out.println(atBatNumbersList);
		
		for(int i = 0; i < atBatNumbersList.size(); i++)
		{
			sumOfBasesFromAtBats += atBatNumbersList.get(i);
		}
		System.out.println("Total Bases: " + sumOfBasesFromAtBats);
		System.out.println("Total at bats: " + numberOfAtBatsAsFloat);
		
		sluggingPercentage = sumOfBasesFromAtBats / numberOfAtBatsAsFloat;
		System.out.println();
		System.out.printf("Player's Slugging Percentage %.3f: " , sluggingPercentage);
		
		
		for (int j = 0; j < atBatNumbersList.size(); j++)
		{
			if (atBatNumbersList.get(j) > 0)
			{
				totalHits ++;
			}
		}
		battingAverage = totalHits / numberOfAtBatsAsFloat;
		System.out.println();
		System.out.printf("Player's Batting Average is %.3f: " , battingAverage);
	}		
}

	


