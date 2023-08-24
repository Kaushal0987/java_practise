package billing_system;

public class Items {
	private String item_name;
	private int item_id;
	private long price;
	
	public void setItems(int item_id, String item_name, long price) {
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
	}
	
	public Items() {
		System.out.println("Item ID: "+item_id+"\n"+"Item Name: "+"\n"+"Price: "+price);
	}
}
