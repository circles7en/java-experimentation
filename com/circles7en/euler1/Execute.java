package com.circles7en.euler1;

import java.util.ArrayList;

public class Execute {
	
	public static void main(String[] args) {
		InputInterface input = new InputInterface();
		int[] multiples = { 3, 5 };
		
		int rangeStart = input.promptUserForInteger("Please Enter The Starting Number: ");
		int rangeEnd = input.promptUserForInteger("Please Enter The Ending Number: ");
		
		if(validateInput(rangeStart, rangeEnd) == false) {
			System.out.println("Input Invalid... Exiting");
		} else {
			ArrayList<Integer> multiplesFound = findMultiplesInRange(multiples, rangeStart, rangeEnd);
			
			printMultiples( "3 and 5", multiplesFound );
			
			int resultingSum = sumArray(multiplesFound);
			
			System.out.printf("Resulting Sum: %d\n", resultingSum);
		}
		
		System.out.println("Goodbye!");
	}
	
	private static boolean validateInput( int rangeStart, int rangeEnd ) {
		if(rangeStart > rangeEnd || rangeStart == rangeEnd || rangeStart < 0)
			return false;
		
		return true;
	}
	
	private static ArrayList<Integer> findMultiplesInRange( int[] multiples, int rangeStart, int rangeEnd ) {
		ArrayList<Integer> multiplesFound = new ArrayList<Integer>();
		
		for( int i = rangeStart; i <= rangeEnd; i++) {
			if( i == 0 )
				continue;
			
			for(int y = 0; y < multiples.length; y++) {
				if( i % multiples[y] == 0 ) {
					multiplesFound.add(i);
					break;
				}
			}
		}
		
		return multiplesFound;
	}
	
	private static void printMultiples( String number, ArrayList<Integer> multiplesFound ) {
		int listSize = multiplesFound.size();
		String resultString = "Multiples of " + number + " Found: ";
		
		for(int i = 0; i < listSize; i++) {
			resultString += multiplesFound.get(i);
			
			if( i != listSize - 1)
				resultString += ", ";
		}
		
		System.out.println( resultString );
	}
	
	private static int sumArray( ArrayList<Integer> list ) {
		int total = 0;
		
		for(int i = 0; i < list.size(); i++)
			total += list.get(i);
		
		return total;
	}
}
