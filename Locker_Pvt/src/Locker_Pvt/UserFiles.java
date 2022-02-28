package Locker_Pvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserFiles  {
public String apt_nbr; 	
Locker_Pvt Lp = new Locker_Pvt(); 


public void initiate() { try {
	File apt101 = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\101.txt");
	File apt102 = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\102.txt");
	File apt201 = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\103.txt");
	File apt202 = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\104.txt");

	      boolean exists = apt101.exists();
	      boolean exists1 = apt102.exists();
	      boolean exists2 = apt201.exists();
	      boolean exists3 = apt202.exists();
	      
	      if (!exists) {apt101.createNewFile(); 
	      FileWriter residentname = new FileWriter(apt101, true);
	      residentname.append("null"); residentname.close();	      
	      System.out.println("File created: " + apt101.getName());
	      Lp.al1.add("101");} 
	      
	      if (!exists1) {apt102.createNewFile(); 
	      FileWriter residentname1 = new FileWriter(apt102, true);
	      residentname1.append("null"); residentname1.close();	       
	      System.out.println("File created: " + apt102.getName());
	      Lp.al1.add("102");}
	     
	      if (!exists2) {apt201.createNewFile();
	      FileWriter residentname2 = new FileWriter(apt201, true);
	      residentname2.append("null"); residentname2.close();	      
	      System.out.println("File created: " + apt201.getName()); 
	      Lp.al1.add("201");}	   
	      	      
	      if (!exists3) {apt202.createNewFile(); 
	      FileWriter residentname3 = new FileWriter(apt202, true);
	      residentname3.append("null"); residentname3.close();	      
	      System.out.println("File created: " + apt202.getName()); 
	      Lp.al1.add("202");}
	           
	      else {System.out.println("File already exists.");	  	
	      File directoryPath = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments");	   
	      String contents[] = directoryPath.list();	 
	      for(int i=0; i<contents.length; i++) 
	      {contents[i] = contents[i].replaceAll(".txt", "");
	    	Lp.al1.add(contents[i]);}   
	      }	
	      } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace(); } }
	
	
public void add() throws IOException { 
Scanner e = new Scanner(System.in);	
apt_nbr = e.nextLine();
if (!Lp.al1.contains(apt_nbr)) {System.out.println("apartment "+ apt_nbr + " does not exist");
System.out.println("Please type in correct apt number");
add();}

else if (Lp.al1.contains(apt_nbr)) {
FileWriter fw = new FileWriter("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\"+apt_nbr+".txt", true);
System.out.println("Please Write new name of the resident that you would like to add.");
String new_name = e.nextLine();
BufferedWriter br = new BufferedWriter(fw);
br.newLine(); 
br.write(new_name); 
br.close();
fw.close();
System.out.println(new_name + " Registered for apartment " + apt_nbr);  

File apt = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\" + apt_nbr + ".txt");
Scanner sc = new Scanner(apt);
StringBuffer sb = new StringBuffer();
List<String> al = new ArrayList<>();
while (sc.hasNextLine()) {
   String input = sc.nextLine();	    
   al.add(input);}   
for (int i = 0; i < al.size()-1; i++) {sb.append(al.get(i)); sb.append("\n");}   
for (int i = al.size()-1; i < al.size(); i++) {sb.append(al.get(i)); }   
String out = sb.toString();
PrintWriter writer = new PrintWriter(apt);
writer.print("");
writer.append(out);
writer.flush();
sc.close(); 
System.out.println("List of names for Apt" + apt_nbr + "\n" + out); 
System.out.println("Would you like to add more resident from the list? 1: yes otherwise press any key");
String yesorno = e.nextLine();
if (yesorno.equals("1")) 
{System.out.println("Please type in the apartment number for the new resident"); 
add();}
else {System.exit(0);}}}


public void delete() throws IOException, IndexOutOfBoundsException {

	try {
	Scanner e = new Scanner(System.in);	
	apt_nbr = e.nextLine();
	if (!Lp.al1.contains(apt_nbr)) {System.out.println("apartment "+ apt_nbr + " does not exist");
	System.out.println("Please type in correct apt number");
	delete();}
	else if (Lp.al1.contains(apt_nbr)) {
	System.out.println("Please Write name of the resident that you would like to delete.");
	String delete_name = e.nextLine();	
	File apt = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\" + apt_nbr + ".txt");	
	Scanner sc = new Scanner(apt);
	StringBuffer sb = new StringBuffer();	
	List<String> al = new LinkedList<>();
	while (sc.hasNextLine()) {
	   String input = sc.nextLine();	    
	   al.add(input);}   		
	if (al.contains(delete_name)) {al.remove(delete_name);} 
	else {System.out.println(delete_name + " does not exist");} 
	for (int i = 0; i < al.size()-1; i++) {sb.append(al.get(i)); sb.append("\n");}   
	for (int i = al.size()-1; i < al.size(); i++) {sb.append(al.get(i)); }   
	String out = sb.toString();
	PrintWriter writer = new PrintWriter(apt);
	writer.print("");
	writer.append(out);
	writer.flush();
	sc.close(); 
	System.out.println("deletion successful"); 	
	System.out.println("List of names for Apt" + apt_nbr + "\n" + out); 
	System.out.println("Would you like to delete more resident from the list? 1: yes otherwise press any key");
	String yesorno = e.nextLine();
	if (yesorno.equals("1")) 
	{System.out.println("Please type in the apartment number for the new resident"); 
	delete();}
	else {System.exit(0);}
	}}  catch (IndexOutOfBoundsException e1) {System.out.println("List is empty"); 
	System.out.println("Please type in the apartment number you want to delete current resident");
	delete(); }	
	}
	
public void search() throws FileNotFoundException { 
	
	Scanner e = new Scanner(System.in);	
	String Search_Name = e.nextLine(); 
	
 	File directoryPath = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments");
    String contents[] = directoryPath.list();
    
 
    for(int i=0; i<contents.length; i++) {
    	try { 	
    	File apt1 = new File("C:\\Users\\soomi\\GitnewProjectDir\\List of Apartments\\" + contents[i]);	
    	Scanner sc = new Scanner(apt1);
    	StringBuffer sb = new StringBuffer();	
    	List<String> al = new LinkedList<>();
    	while (sc.hasNextLine()) {
    		
    	   String input = sc.nextLine();	    
    	   al.add(input);}   
    	
    	if (al.contains(Search_Name)) {contents[i] = contents[i].replaceAll(".txt", "");
    		System.out.println(Search_Name + " exist in apt number" + contents[i]);} 
    	
    	else {contents[i] = contents[i].replaceAll(".txt", "");
    		System.out.println(Search_Name + " does not exist in apt number " + contents[i]);} 
    }
    	catch(FileNotFoundException e2) {System.out.println("No apartment number is found"); }  }
    
    System.out.println("Would you like to find anouther resident? Press 1 for yes otherwise press any number");	
	int opt = e.nextInt(); 
	
	if (opt==1) { System.out.println("please type in the name of the resident that you want to search."); 
	search(); }
	else { System.out.println("System closing..."); 
	System.exit(0); }
} 	




}
	







