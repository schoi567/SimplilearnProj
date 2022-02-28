package Locker_Pvt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Control_Userfiles {
	public String apt_nbr1; 	
	Locker_Pvt lp2 = new Locker_Pvt(); 
	public void add() throws IOException { 
		Scanner e4 = new Scanner(System.in);	
		apt_nbr1 = e4.nextLine();
		File fadded = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\" + apt_nbr1+ ".txt");
	    boolean exists = fadded.exists();
		if (!exists) {fadded.createNewFile(); }
		else {System.out.println("file already exist please press apartment number not listed"); add();}		
		
		File directoryPath = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments");
	    String contents[] = directoryPath.list();
	    int arrsize = contents.length;
	    for(int i=0; i<arrsize; i++) {contents[i] = contents[i].replaceAll(".txt", "");
	    	if (!lp2.al1.contains(contents[i])) 
	    		{lp2.al1.add(contents[i]); }
	    	}
	    
	    Collections.sort(lp2.al1);   
	    
	    System.out.println("list of apartments:" + lp2.al1); 	
	    
		System.out.println("apartment added.  Would you like to add more? press 1 for yes otherwise press any key"); 
		Scanner e5 = new Scanner(System.in);	
		String yrn = e5.nextLine();
		if (yrn.equals("1")) 
			{System.out.println("Please type in the apartment number you want to add");	
			add();}			
		else {System.out.println("System closing....");System.exit(0);} 
		}  
	

	public void delete() throws IOException {
		Scanner e4 = new Scanner(System.in);	
		apt_nbr1 = e4.nextLine();
		
		if (apt_nbr1.equals("101")) {System.out.println("you cannot elimiate the first floor. There cannot be an apartment without the first floor."
				+ " which contain 101,102,103,104");
		System.out.println("Please type in valid apt number"); 
		delete();}
		if (apt_nbr1.equals("102")) {System.out.println("you cannot elimiate the first floor. There cannot be an apartment without the first floor."
				+ " which contain 101,102,103,104");System.out.println("Please type in valid apt number"); 
				delete();}
		if (apt_nbr1.equals("103")) {System.out.println("you cannot elimiate the first floor. There cannot be an apartment without the first floor."
				+ " which contain 101,102,103,104");System.out.println("Please type in valid apt number"); 
				delete();}
		if (apt_nbr1.equals("104")) {System.out.println("you cannot elimiate the first floor. There cannot be an apartment without the first floor."
				+ " which contain 101,102,103,104");System.out.println("Please type in valid apt number"); 
				delete();}
		
		File fadded = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\" + apt_nbr1+ ".txt");
	    boolean exists = fadded.exists();
		if (!exists) {System.out.println("Apartment" + apt_nbr1 + "does not exist");
		System.out.println("Please type in valid apt number");
		delete();}
		else {fadded.delete(); lp2.al1.remove(apt_nbr1);}
		
		File directoryPath = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments");
	    String contents[] = directoryPath.list();
	    int arrsize = contents.length;
	    for(int i=0; i<arrsize; i++) {contents[i] = contents[i].replaceAll(".txt", "");
	    	if (!lp2.al1.contains(contents[i])) 
	    		{lp2.al1.add(contents[i]); }
	    	}
	    
	    System.out.println("apartment deleted.  Would you like to delete more? press 1 for yes otherwise press any key"); 
		Scanner e5 = new Scanner(System.in);	
		String yrn = e5.nextLine();
		if (yrn.equals("1")) 
			{System.out.println("Please type in the apartment number you want to add");	
			delete();}			
		else {System.out.println("System closing....");System.exit(0);} 
		}  
	
	public void search() throws IOException {

		Scanner e4 = new Scanner(System.in);	
		apt_nbr1 = e4.nextLine();		
		File directoryPath = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments");
	    String contents[] = directoryPath.list();
	    int arrsize = contents.length;
	    for(int i=0; i<arrsize; i++) {contents[i] = contents[i].replaceAll(".txt", ""); }
	    
	    boolean apt_exist = Arrays.stream(contents).anyMatch(apt_nbr1::equals);
	    
	    if (apt_exist)
	    	{System.out.println("The apartment number " + apt_nbr1 + " exists in our apartment"); }
	    else 
	    	{System.out.println("The apartment number " + apt_nbr1 + " does not exists in our apartment");}    
	    
	    	
	    	
	    	System.out.println("Below are the list of Apartments."); 
	    for(int i=0; i<arrsize; i++) {System.out.println("apartment number:" + contents[i]); }

		 System.out.println("Would you like to search more apartment? Press 1 for yes otherwise press any key to exit"); 
			Scanner e5 = new Scanner(System.in);	
			String yrn = e5.nextLine();
			if (yrn.equals("1")) 
				{System.out.println("Please type in the apartment number you want to search");	
				search();}			
			else {System.out.println("System closing....");System.exit(0);} 
			}  }



	










		
		
	
	
