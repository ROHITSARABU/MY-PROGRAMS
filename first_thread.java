package threads;

import java.util.Scanner;

public class first_thread implements Runnable
{
public void run()
{

for(int i=0;i<20;i++)
{
	System.out.println("the value is"+i);
}
}
public static void main(String[] args) 
{
	first_thread as=new first_thread();
	Thread t1=new Thread(as);
	t1.start();
	for(int k=1;k<20;k++)
	{
		System.out.println("main tread"+k);
	}
}
}
