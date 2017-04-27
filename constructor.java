
public class constructor {
	public static void main(String[] args) {
		a a1=new a(6);
		su sub=new su(10,6,6);
		mul mul1=new mul(6,6);
		div div1=new div(6,6);
		perc per1=new perc(30,30,30,30,30);
	}

}
class a
{
	a(int a)
	{
	int b=10;
		int addition;
		addition=a+b;
		System.out.println("the addition is ="+addition);
	}
}
class su
{
	su(int a,int b,int c)
	{
		int subtraction;
		subtraction=a-b-c;
		System.out.println("the subtration is ="+subtraction);
	}
}

class mul
{
	mul(int a,int b)
	{
		int multiplication;
		multiplication=a*b;
		System.out.println("the multiplication is ="+multiplication);
	}
}
class div
{
	div(int a,int b)
	{
		int division;
		division=a/b;
		System.out.println("the disvision is ="+division);
}
}
class perc
{
	perc(int m1,int m2,int m3,int m4,int m5)
	{
		int total,percent;
		total=m1+m2+m3+m4+m5;
		System.out.println("the total is="+total);
		percent=total/5;
		System.out.println("the percentage is"+percent);
	}
}