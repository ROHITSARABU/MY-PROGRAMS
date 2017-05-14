package student;

import java.util.Scanner;

public class Info 
{
public static void main(String[] args)
{
	int rollno;
	String name,mailid,pwd;
	Info obj=new Info();
	obj.userinfo();
}


void userinfo()
{
for(int i=0;i<4;i++)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the roll no");
		int rollno=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter mail id");
		String mailid=sc.next();
		System.out.println("enter password");
		String pwd=sc.next();
	
		System.out.println("the roll number is="+rollno);
		System.out.println("the name is"+name);
		System.out.println("the mail id is="+mailid);
		System.out.println("the password is="+pwd);
	}
}
}