package registration_package;

import java.util.Scanner;

public class Login_registration 
{
	String uname,rollno,age,name,password,unam,pass;
 public static void main(String[] args)
 
 { 
	 Login_registration reg=new Login_registration();
	 reg.register();
	 
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter the username");
	String unam=sc.next();
	System.out.println("enter password");
	String pass=sc.next();
	reg.valid();
	
 }
 void valid()
 {
	 if((uname==unam)&&(password==pass))
	 {	
		 System.out.println("login successfully");
	 
		
	 }
	 
 }
 void register()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the rollno");
     String rollno=sc.next();
     System.out.println("enter the name");
     String name=sc.next();
     System.out.println("enter user name");
     String uname=sc.next();
     System.out.println("enter the password");
     String password=sc.next();
     System.out.println("enter age");
     String age=sc.next();
 }
}
