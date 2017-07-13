package sample;
import java.util.Scanner;

public class palindrome 
{
public static void main(String[] args) 
{
    String original, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the string");
    original = in.next();

    int length = original.length();

    for ( int i = length - 1; i >= 0; i-- ){
       reverse = reverse + original.charAt(i);
    }
    if (original.equals(reverse))
       System.out.println("string is a palindrome.");
    else
       System.out.println("string is not a palindrome.");
}
}
