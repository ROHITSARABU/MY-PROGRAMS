package sample;

import java.util.Scanner;

public class fact 
{
public static void main(String[] args) {
	int num,fact;
	fact=1;
	System.out.println("enter the value");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
		
	}
	System.out.println("the facatorial is="+fact);
}
}
