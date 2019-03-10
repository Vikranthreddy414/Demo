package chapter3;
import java.util.Scanner;
public class Divisible {
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.print("enter first number:");
	int a=in.nextInt();
	System.out.print("enter second number:");
	int b=in.nextInt();
	if(a/b==0)
	{
		System.out.println("it is divisible");
		if(b==0)
		{
			System.out.println("error");
		}
		
	}	
}
}