package chpater2;
import java.util.Scanner;
public class exercise1 
 { public static void main(String[] args)
 {

	  Scanner in=new Scanner(System.in);
	  System.out.println("enter acceleration in met/sec*sec:");
	  int a=in.nextInt();
	  System.out.println("enter velocity in met/sec:");
	   int u=in.nextInt();
	  System.out.println("enter time in sec:");
	   int t=in.nextInt();
	   int Distance= u*t + ( a*t*t )/2;
	  System.out.println("Distance is"+Distance);
 }

}
