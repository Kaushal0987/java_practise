package billing_system;

public class Customer_Info {
	private int Customer_ID;
	private String Customer_Name;
	private String Item_bought;
	private int quantity;
	
	public Customer_Info(int Customer_ID, String Customer_Name) {
		this.Customer_ID = Customer_ID;
		this.Customer_Name = Customer_Name;
	}
	
	public void setInfo(String Item_bought, int quantity) {
		this.Item_bought = Item_bought;
		this.quantity = quantity;
	}
	
	public void display(){
		System.out.printf("Customer ID: "+Customer_ID);
		System.out.printf("Customer name: "+Customer_Name);
		System.out.printf("Items Bought: "+Item_bought);
		System.out.printf("Quantity: "+quantity);
	}
}
