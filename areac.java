package area;

public class areac 
{
	void circle()
	{
	int r=3;
	double pi=3.14,cir;
	cir=pi*r*r;//find the area of circle
	System.out.println("the area of circle is"+cir);//print the area of circle
	}
	void triangle()
	{
	double w,h;
	w=6.0;h=7.0;
	double tri=0.5*w*h;//find the area triangle
	System.out.println("the area of triangle is"+tri);//print the area of triangle
	}
	void rectangle()
	{
	float l,b,rect;
	l=5;b=6;
	rect=l*b;//find the area of rectangle
	System.out.println("the area of rectangle is"+rect);//print the area of rectangle
	}
	void sqare()
	{
	float a,sqr;
	a=4;
	sqr=a*a;//find the area of square
	System.out.println("the area of square is"+sqr);//print the area of square
	}
	public static void main(String[] args) 
	{
		areac obj=new areac();
		obj.rectangle();
		obj.circle();
		obj.triangle();
		obj.sqare();
	}
}
