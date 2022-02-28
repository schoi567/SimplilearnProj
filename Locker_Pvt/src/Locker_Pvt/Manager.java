package Locker_Pvt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Manager {
public String yesorno;  public int adsr;  public int mgrpwd = 33; 
UserFiles userfiles = new UserFiles(); 
Control_Userfiles ctrlusrfiles = new Control_Userfiles();
Locker_Pvt lp3 = new Locker_Pvt();


public void ManagerQ() throws IOException, InterruptedException  {
{if (yesorno.equals("1")) {return;}

if (yesorno.equals("0")) 
{System.out.println("Please type in your password");
Scanner a = new Scanner(System.in);	
int typedinpw = a.nextInt();
if (typedinpw == mgrpwd) {
System.out.println("Would you like to add users, delete users, search users, return to main, or close the entire program?"
		+ "\n" + "Please press 1,2,3,4 and 5 respectively to the following option");
adsr = a.nextInt(); 
Fileinout(); }    

else if (typedinpw != mgrpwd) 
{System.out.println("Wrong Password Please press restart"); ManagerQ();} }

else {System.out.println("Wrong number Please type in correct number"); 
Scanner s = new Scanner(System.in);	
yesorno = s.nextLine(); ManagerQ();}

}}  


public void Fileinout() throws IOException, InterruptedException {
	switch (adsr) {
case 1: 
	adsr = 1; 
{System.out.println("Are you adding new apartment? press 1 for yes and 2 for no");	
	Scanner a = new Scanner(System.in);	
	try {int yn = a.nextInt();
	if (yn==1) 
		{System.out.println("Please type in the apartment number you want to add");	
	ctrlusrfiles.add(); break; }
	
	if (yn==2)
		{System.out.println("Please type in the apartment number you want to add in order to add current resident");	
	userfiles.add(); break; }

	else {System.out.println("Please type in correct number");
	System.out.println("Please type in your password again for varification");
	ManagerQ();	} } 
	catch(InputMismatchException e3) {System.out.println("Please type in a number");ManagerQ();} }
	
case 2:
	adsr = 2;
	{System.out.println("Are you deleting closing off an apartment? (apartment 101,102,201 and 202 cannot be deleted)."
			+ " press 1 for yes and 2 for no");	
	Scanner a = new Scanner(System.in);	
	try {int yn = a.nextInt();
	if (yn==1) 
		{System.out.println("Please type in the apartment number you want to delete current resident");
	ctrlusrfiles.delete(); break; }
	
	if (yn==2)
		{System.out.println("Please type in the apartment number you want to delete in order to delete current resident");	
		userfiles.delete(); break;}

	else {System.out.println("Please type in correct number");
	System.out.println("Please type in your password again for varification");
	ManagerQ();	} } 
	catch(InputMismatchException e3) {System.out.println("Please type in a number");ManagerQ();} }	

	
case 3:
	adsr = 3;
{	System.out.println("Would you like to look up apartment first?" 
	+ " press 1 for yes and 2 for no");
Scanner a = new Scanner(System.in);	
try {int yn = a.nextInt();
if (yn==1) 
	{System.out.println("Please type in the apartment number you want to search");
ctrlusrfiles.search(); break; }

if (yn==2)
{System.out.println("please type in the name of the resident that you want to search."); 
userfiles.search(); break;} 


else {System.out.println("Please type in correct number");
System.out.println("Please type in your password again for varification");
ManagerQ();	} } 
catch(InputMismatchException e3) {System.out.println("Please type in a number");ManagerQ();} }	


	
case 4:
	adsr = 4;
{System.out.println("Going back to Main......"); 
lp3.al1 = new ArrayList<>(List.of()); 
Thread t = Thread.currentThread();
System.out.println("Current thread: " + t.getName());
Thread t1 = new Thread() {public void run() {String[] args = { }; 
try {Locker_Pvt.main(args);} catch (IOException e) {e.printStackTrace();} 
catch (InterruptedException e) 
	{System.out.println("New System run interrupted. Please Press Restart."); e.printStackTrace();}
}	};		
t1.start();  t.join(); } 

case 5:
	adsr = 5;
{System.out.println("Shutting down the program... "); 
System.exit(0); break;}

default:
{System.out.println("Please type appropriate number");
Scanner a = new Scanner(System.in);	
adsr = a.nextInt(); 
Fileinout();
}
	
	
	}
	
} } 



















