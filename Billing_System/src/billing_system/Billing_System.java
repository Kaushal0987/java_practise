package billing_system;
import java.util.*;

public class Billing_System {
	
	public static void menu() {
		System.out.println("******Menu list******");
		System.out.println("1. write new data");
		System.out.println("2. read existing data");
		System.out.println("3. update existing data");
		System.out.println("4. Delete existing data");
		System.out.println("5. create invoice");
		System.out.println("6. Exit the system");
	}

	public static void main(String[] args) {
		int choice;
		char ch;
		Customer_Data C = new Customer_Data();
		Invoice I = new Invoice();
		Scanner in = new Scanner(System.in);
		
		do
		{
			menu();
			System.out.print("Enter the operation you want to compute: ");
			choice = in.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.print("Enter The Customer ID: ");
					int id = in.nextInt();
					in.nextLine();
					
					System.out.print("Enter The Customer Name: ");
					String name = in.nextLine();
					
					System.out.print("Enter The item bought: ");
					String item = in.nextLine();
					
					System.out.print("Enter The price of item: ");
					double price = in.nextDouble();
					
					System.out.print("Enter The quantity of item: ");
					double quantity = in.nextDouble();
					
					C.setData(id, name, item, price, quantity);
					C.insert();
					
					break;
					
				case 2:
					System.out.println("1. Read all data");
					System.out.println("2. Read a customer data");
					int c = in.nextInt();
					if(c==1) {
						C.select();
					}
					else {
						System.out.print("Enter The id of customer you want to read data of: ");
						int c_id = in.nextInt();
						C.selectID(c_id);
					}
					
					break;
					
				case 3:
					System.out.print("Enter The ID of the customer to update: ");
					int Update_id = in.nextInt();
					in.nextLine();
					
					System.out.println("Enter The Updated data");
					
					System.out.print("Enter The Updated Customer Name: ");
					String Newname = in.nextLine();
					
					System.out.print("Enter the Updated Items Bought: ");
					String Newitem = in.nextLine();
					
					System.out.print("Enter the Updated price of the item: ");
					double Newprice = in.nextDouble();
					
					System.out.print("Enter The Updated Quantity: ");
					double Newqty = in.nextDouble();
					
					C.setData(Update_id, Newname, Newitem, Newprice, Newqty);
					C.update();
					
					break;
					
				case 4:
					System.out.print("Enter The id of customer you want to delete data of: ");
					int Delete_id = in.nextInt();
					
					C.setID(Delete_id);
					C.delete();	
					
					break;
					
				case 5:
					System.out.print("Enter The id of customer you want to create invoice of: ");
					int inv_id = in.nextInt();
					I.setinvID(inv_id);
					I.invoice();
					
					break;
					
				case 6:
					System.exit(0);
					
				default:
					System.out.println("Wrong input");
					break;
			}
			
			System.out.print("Do you want to compute other operation (y/n):  ");
			ch = in.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		in.close();

	}

}
