package sample;

import java.util.Scanner;

public class perfect_number 
{
public static void main(String[] args) 
{
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		System.out.println("it is prfect number");
		
	}
	else
	{
		System.out.println("it is not perfect number");
	}
}
int divisor(int x)

{

   return x;

}
}
