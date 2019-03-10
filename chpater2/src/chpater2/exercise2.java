package chpater2;

import java.util.Scanner;

public class exercise2 {
   public static void main(String[] args)
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("enter radius:");
	   int r=in.nextInt();
	   System.out.println("enter height:");
	   int h=in.nextInt();
	   double Volume=22/7*r*r*h;
	   System.out.println(+Volume);
   }

}

