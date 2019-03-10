package chapter3; 
import java.util.Scanner; 

public class Prime {
	public static void main (String[] args)
	{
		int n,w,x;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		n=sc.nextInt();
		System.out.println("\nlist of prime numbers between 1 to"+n+":");
		for(int i=1;i<=n;i++)
		{
         w=i;
         x=0;
         for(int j=1;j<=w;j++)
         {
        	 if(w%j==0)
        	 {
        		 x++;
        	 }
        	 }
         if(x==2)
         {
        	 System.out.println(""+w);
         }
         }
		}
		
	}


