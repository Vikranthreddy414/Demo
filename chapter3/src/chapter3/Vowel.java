package chapter3;
import java.util.Scanner;
public class Vowel {
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter character:");
	char ch=in.next().charAt(0);
    switch(ch)
	{
		case 'A':
		case 'a':
			System.out.println("it is vowel");
			break;
		case 'E':
		case 'e':
		System.out.println("it is vowel");
		 break;
		case 'I':
		case 'i':
		System.out.println("it is vowel");
		break;
		case 'O':
		case 'o':
		System.out.println("it is vowel");
		break;
		case 'U':
		case 'u':
		System.out.println("it is vowel");
		break;
		default:
		System.out.println("it is consonant");
	}
	}
}
