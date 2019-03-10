package chpater2;
import java.util.Scanner;
public class exercise3 {
	public static void main(String[] args)
	{   double C,F;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enetr Celcius temperature:");
		 C=in.nextInt();
		 F=C*9/5+32;
		System.out.println("Temperature in Fahernhiet:"+F);
	}

}
