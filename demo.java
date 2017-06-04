package multitasking;

public class demo extends Thread

{
public void run()
{
	
	for(int i=0;i<200;i++)
	{
		System.out.println("the method is called");
		System.out.println("current method:" +Thread.currentThread().getId()+"& i:"+i);
	}
}
public static void main(String[] args) throws InterruptedException
{
	demo d=new demo();
	d.start();
	for(int i=200;i<400;i++)
	{
		
		System.out.println("other thread:"+i);
		Thread.sleep(9000);
	}
}
}
