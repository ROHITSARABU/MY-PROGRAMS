package threads;

public class customer 
{
int amount=100000;

synchronized void withdraw(int amt)
{
	System.out.println("process is starting");
	if(this.amount>amount)
	{
		System.out.println("the balance is less; please deposit.. and waiting for u r deposit");
		try{
			wait();
		}
		catch(Exception e)
		{
			
		}
	}
	this.amount=amount-amt;
	System.out.println("the process is completed");
	System.out.println("the available balance is:"+amount);
}
synchronized void deposit(int amt)
{
	this.amount=amount+amt;
	System.out.println("process is completed ");
	System.out.println("the available balance is:"+amount);
}
}
