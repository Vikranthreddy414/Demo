package chapter3;
import java.util.Scanner;
public class exercise1 {
	public void showMenu()
	{
		Scanner in=new Scanner (System.in);
		System.out.println("1.Enter data");
		System.out.println("2.Display data");
		System.out.println("3.Exit");
		System.out.println("\nChoose choice");
		int choice=in.nextInt();
		switch(choice)
		{
		case 1:
			EnterData();
			break;
		case 2:
			DisplayData();
			break;
		case 3:
			ExitData();
			break;
		case 4:
			System.out.println("incorrect option");
			showMenu();
			break;
		}
	}
	 public void EnterData() {
		 System.out.println("EnterData method is invkoved");
	 }
	public void DisplayData() {
		System.out.println("DisplayData method is invoked");
	}
    public void ExitData(){
    	System.out.println("ExitData method is invoked");
    }
    public static void main(String[] args)
    {
    	exercise1 obj=new exercise1();
    	obj.showMenu();
    }
    }
 