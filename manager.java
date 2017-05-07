package example;

public class manager 
{
	public static void main(String[] args) 
	{
	Twowheelers t1=new Twowheelers();
	System.out.println("the 2 wheeler cost is"+t1.getCost()+"  Rupees");
	System.out.println("the 2 wheeler speed is "+t1.getspeed()+"  Speed/second");
	Threewheeler t2=new Threewheeler();
	System.out.println("the 3 wheeler cost is "+t2.getCost()+"  Rupees");
	System.out.println(" the 3 wheeler speed is"+t2.getspeed()+"  Speed/second");
	Fourwheeler t3=new Fourwheeler();
	System.out.println("the 4 wheeler cost is"+t3.getCost()+"  Rupees");
	System.out.println("the 4 wheeler speed is "+t3.getspeed()+"  Speed/second");
	}
}
