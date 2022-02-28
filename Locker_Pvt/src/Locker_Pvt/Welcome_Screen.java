package Locker_Pvt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome_Screen {
	public Welcome_Screen() { 
		System.out.println("Application Name: Lockers Set Up for Residents and Securities" + "\n" ); 
		
		
		
		System.out.println("Developer details: With lockers already built in to the system, " + "\n"
				+ "this application gives security access to the name of the residents living in"
				+ "the apartment and the apartment set up." + "\n" ); 
		
		
		
		System.out.println("Details of the user interface: There was recent real estate development in New York City."
				+ "\n" + "With rise of online shopping, apartment complex securities have to check the name of the resident and their ID even if residents have to type in the passcodes."  +
				"\n" + "Also, it is the securities' responsiblity to add in more apartment number and the residents living inside as new apartment complexes can be built with higher stories." 
				+ "\n" + "first floor was already built and the Apt include 101,102,103,104, and cannot be changed, since every apartment need the first floor."  + "\n" 
				+ "This application has built in locker system that requires passcode for the lockers to open, and it gives access to search and revise the names and apartment numbers."
				+ "\n" + "Apartment numbers will be on the file system, and the residents names are on memo file system." ); 
		
		
		System.out.println();
		System.out.println("Please select 1 to continue and 2 to exit.");

		
		go_on();
		 
		
	}
	
	public void go_on() throws InputMismatchException {
	try {Scanner e5 = new Scanner(System.in);	
	int opt = e5.nextInt();

	
	switch (opt) {
	case 1: 
		 { return;} 
	case 2:	 
	{ System.exit(0);} 
		 
	default: 
	 {System.out.println("Please type in correct number"); go_on();} 
	}} catch (InputMismatchException IME) { System.out.println("Please type in correct number"); go_on();}
	
	
	 }
}
