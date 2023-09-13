package billing_system;

import java.io.*;  

public class Invoice extends Customer_Data{
	private int invoice_id;
	
	public void setinvID(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	
	public void invoice() {
		
		selectID(invoice_id);
		
		
		try {
			
			File invoice = new File("invoice.txt");
			invoice.createNewFile();
			
			PrintWriter pw = new PrintWriter(invoice);
			
			pw.println("INVOICE");
			pw.println("-----------------------------------------------------------------------------------------------------------\n");
			
			pw.format("%60s", "COMPANY NAME\n\n");
			pw.println("-----------------------------------------------------------------------------------------------------------\n");
			
			pw.format("%30s%12s\n","Customer Name: ",Customer_name);
			pw.format("%28s%12s\n\n","Customer ID:",Customer_id);
			pw.println("-----------------------------------------------------------------------------------------------------------\n\n");
			
			pw.format("%38s %18s %20s\n", "Item", "Price", "Quantity");
			pw.format("%38s %18s %20s\n\n\n", item, price, quantity);
			pw.println("-----------------------------------------------------------------------------------------------------------\n\n");
			
			pw.format("%30s%12s", "Total Amount: ",(price*quantity));
			
			if(invoice.exists()) {
				System.out.println("Invoice Created!");
			}
			else {
				System.out.println("Someting wrong!");
			}
			
			pw.close();
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}
}
