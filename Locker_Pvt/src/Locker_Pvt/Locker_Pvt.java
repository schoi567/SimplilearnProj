package Locker_Pvt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
 
class Locker_Pvt extends Thread{
	public static List<String> al1 = new ArrayList<>(List.of()); 
	public int size1 = al1.size();	
	public int[] arr = new int [size1+1];
	

	
	
	public void initiate1()  {
		for(int i=0; i<size1; i++) {
		int b = Integer.parseInt(al1.get(i)); 
		arr[i] = b;
	
		
}} 
	
	
	
	

		    	
	public int[] arr1 = new int [] {1234,4862,6416,5674};
	
	public void Apt_numcheck(int[] arr, int toCheckNumber) throws InterruptedException
	{Arrays.sort(arr);
	int res = Arrays.binarySearch(arr, toCheckNumber);
    boolean test = res > 0 ? true : false;
    if (test == true) 
    {System.out.println("Welcome! Please type in passcode for Apartment #");} 
    
    else {System.out.println("The number is in not in our Apartment.");    
	Scanner s = new Scanner(System.in);	
    int toCheckNumber1 = s.nextInt(); 
    Apt_numcheck(arr,toCheckNumber1); } }
	
	public void check(int[] arr1, int Name_Check1) throws InterruptedException
    {boolean test1 = false;
    for (int element : arr1) {if (element == Name_Check1) {test1 = true; break;}}
    if (test1 == true) {System.out.println("Locker open.  Please get your package");}
    
    else if (test1 == false) 
    {System.out.println("Passcode not matched. Going back to main");    
    
    arr = new int [] {};
    Thread t = Thread.currentThread();
    System.out.println("Current thread: " + t.getName());
    Thread t1 = new Thread() {public void run() {String[] args = { }; 
    try {Locker_Pvt.main(args);} catch (IOException e) {e.printStackTrace();} 
    catch (InterruptedException e) 
    	{System.out.println("New System run interrupted. Please Press Restart."); e.printStackTrace();}
    }	};		
    t1.start();  t.join(); } 
}
	

	public static void main(String[] args) throws IOException, InterruptedException, InputMismatchException
	{Welcome_Screen wc = new Welcome_Screen(); 		
		UserFiles userfiles = new UserFiles(); 
	System.out.print("Were starting files created?: ");
	userfiles.initiate(); 
	Manager m = new Manager(); 		
	Locker_Pvt lp2 = new Locker_Pvt(); 

	lp2.initiate1(); 	
	System.out.println("List of apartment (files) currently available");	
	for(int i=0;i<lp2.arr.length-1;i++) 
	{System.out.println(lp2.arr[i]);}
	System.out.println("Are you a resident or a manager of this Apartment? Please press '0' for manager and '1' for residents");
	try {
	Scanner s = new Scanner(System.in);	
	m.yesorno = s.nextLine(); 	
	
	
	m.ManagerQ(); 	
	System.out.println("Please type in your Apt Number");	
    int toCheckNumber1 = s.nextInt(); 
	lp2.Apt_numcheck(lp2.arr, toCheckNumber1);
	int Name_Check1 = s.nextInt();
	lp2.check(lp2.arr1,Name_Check1);}

	catch (InputMismatchException e2) {System.out.println("Please type in a number please press restart"); } }}

	










 












