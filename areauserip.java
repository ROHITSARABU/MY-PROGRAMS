package area;

import java.util.Scanner;

public class areauserip 
{
public static void main(String[] args) 
{
	
	areauserip obj=new areauserip();
	obj.circle();
	obj.rectangle();
	obj.triangle();
	obj.sqare();
}


void circle()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radious");
	int r=sc.nextInt();
	double pi=3.14,cir;
	cir=pi*r*r;
	System.out.println("area of circle is="+cir);
}
void rectangle()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter lenght");
float l=sc.nextFloat();
System.out.println("enter breadth");
float b=sc.nextFloat();
float rect=l*b;//find the area of rectangle
System.out.println("the area of rectangle is"+rect);//print the area of rectangle
}

void sqare()
{
float sqr;
Scanner sc=new Scanner(System.in);
System.out.println("enter the a");
float a=sc.nextFloat();
sqr=a*a;//find the area of square
System.out.println("the area of square is"+sqr);//print the area of square
}
void triangle()
{
double w,h;
Scanner sc=new Scanner(System.in);
System.out.println("entr width");
w=sc.nextDouble();
System.out.println("enter length");
h=sc.nextDouble();
double tri=0.5*w*h;//find the area triangle
System.out.println("the area of triangle is"+tri);//print the area of triangle
}
}