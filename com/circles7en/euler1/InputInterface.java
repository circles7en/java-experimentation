package com.circles7en.euler1;

import java.util.Scanner;

public class InputInterface {
	
	private Scanner input = new Scanner(System.in);
	
	//Default Constructor
	public InputInterface() {};
	
	public int promptUserForInteger( String prompt ) {
		System.out.print( prompt );
		
		return input.nextInt();
	}
	
}
