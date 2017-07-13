package sample;

import java.util.Scanner;

public class prime_number 
{
public static void main(String[] args) 
{
	int num,i,a=0,flag=0;
	System.out.println("enter the value");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	a=num/2;
	for(i=2;i<=a;i++)
	{
		if(num%i==0)
		{
			System.out.println("its not prime number");
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println("it is prime number");
	
}
}
