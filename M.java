package reflection_API;
import java.lang.reflect.*;  
import java.util.Scanner;

public class M {
	public static void main(String args[])throws Exception{  
		Class c=A.class;  
		Object obj=c.newInstance();  
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number =");
		  num=sc.nextInt();
		Method m=c.getDeclaredMethod("cube",new Class[]{int.class});  
		m.setAccessible(true);  
		m.invoke(obj,num);  


}
}
