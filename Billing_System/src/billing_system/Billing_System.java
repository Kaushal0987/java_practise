package billing_system;
import java.util.Scanner;

public class Billing_System {

	public static void main(String[] args) {
		int choice;
		char ch;
		
		Scanner in = new Scanner(System.in);
		
		do
		{
		
			System.out.println("1. write new data");
			System.out.println("2. read existing data");
			System.out.println("3. update existing data");
			System.out.println("4. create invoice");
			System.out.println("5. Exit the system");
			System.out.print("Enter the operation you want to compute: ");
			choice = in.nextInt();
		
		
			switch(choice)
			{
				case 1:
					
					break;
					
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				case 4:
					
					break;
					
				case 5:
					break;
					
				default:
					System.out.print("Wrong input");
					break;
			}
			
			System.out.print("Do you want to compute other operation (y\n):  ");
			ch = in.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');

	}

}
