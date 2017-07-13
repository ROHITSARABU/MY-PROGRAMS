package sample;

import java.util.Scanner;

public class armstrongnum {
	public static void main(String[] args) 
	{
		int a,c=0,num,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		temp=num;
		int n=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
			
		}
		if(temp==c)
		
			System.out.println("the number" +n+ "is armstrong number");
			
		
		else
		
			System.out.println("the number " +n+ " is not armstrong numer");
		
	}

}
