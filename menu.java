import java.util.*;
class Menu
{
	public static void main(String[]args)
	{
		System.out.println("*********menu**********\n1.add number\n2.subtract number\n3.multiply number\n4.divide number");
		System.out.print("Enter your choice : ");
		Scanner in = new Scanner (System.in);
		int choice = in.nextInt();

		System.out.print("enter value of x :");
		Scanner fv = new Scanner (System.in);
		int x = fv.nextInt();

		System.out.print("enter value of y :");
		Scanner sv = new Scanner (System.in);
		int y = sv.nextInt();

		switch(choice)
		{
			case 1:
			int a = x+y;
			System.out.println("addition = "+a);
			break;

			case 2:
			int s = x-y;
			System.out.println("subtraction = "+s);
			break;

			case 3:
			int m = x*y;
			System.out.println("multiplication = "+m);
			break;

			case 4:
			
			int d = x/y;
			System.out.println("division = "+d);
			break;

			default:
			System.out.println("wrong input");
			break;
		}
	}
}