package palindrome;

import java.util.Scanner;

public class polindrom 
{
	public static void main(String[] args) 
	{
		
	
	String s1;
	String s2=" ";
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the string");
	s1=sc.next();
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
		
	}
	System.out.println(s2);
	System.out.println("the lenth of te string is"+s1.length());
	System.out.println("the position is "+s1.indexOf(3));
	if (s1==s2) 
	{
		System.out.println("it a palindrome");
	
	}
	else
		System.out.println(" it is not palindrome");
	}
}
