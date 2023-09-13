package billing_system;

import java.sql.*;
public class Customer_Data {
	String jdbcUrl = "jdbc:mysql://localhost:3306/billingsystem";
    String user = "root";
    String pass = "";
    
	protected int Customer_id;
	protected String Customer_name;
	protected String item;
	protected double price;
	protected double quantity;
	
	public void setData(int Customer_id, String Customer_name, String item, double price, double quantity){
		this.Customer_id = Customer_id;
		this.Customer_name = Customer_name;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setID(int Customer_id) {
		this.Customer_id = Customer_id;
	}
	
	public void setName(String Customer_name) {
		this.Customer_name = Customer_name;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public void insert() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			Statement st = con.createStatement();
			String qry = "INSERT INTO `customer_data`(id, name, item, price, quantity) VALUE ('"+Customer_id+"','"+Customer_name+"','"+item+"','"+price+"','"+quantity+"');";
			int stat = st.executeUpdate(qry);
			if(stat>0) {
				System.out.println("Data Inserted!");
			}
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void select() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM customer_data");
			while(rs.next()) {
				System.out.println("Customer ID: "+rs.getInt(1)+"\nCustomer Name: "+rs.getString(2)+"\nItem: "+rs.getString(3)+"\nPrice: $"+rs.getDouble(4)+"\nQuantity: "+rs.getDouble(5)+"\nTotal Amount: $"+(rs.getDouble(4)*rs.getDouble(5))+"\n");
			}
				con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	protected void selectID(int s_id) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM customer_data WHERE id="+s_id+"");
			
			while(rs.next()){
				
				setID(rs.getInt(1));
				setName(rs.getString(2));
				setItem(rs.getString(3));
				setPrice(rs.getDouble(4));
				setQuantity(rs.getDouble(5));
			}
			
			System.out.println("Customer ID: "+Customer_id+"\nCustomer Name: "+Customer_name+"\nItem: "+item+"\nPrice: $"+price+"\nQuantity: "+quantity+"\nTotal Amount: $"+(price*quantity));
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void update() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			Statement st = con.createStatement();
			String qry;
			qry = "UPDATE customer_data set name='"+Customer_name+"', item='"+item+"', price='"+price+"', quantity='"+quantity+"'  WHERE id="+Customer_id+"";
			int stat = st.executeUpdate(qry);
			if(stat>0) {
				System.out.println("Data Updated!");
			}
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void delete() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			Statement st = con.createStatement();
			String qry;
			qry = "Delete FROM customer_data WHERE id="+Customer_id+"";
			int stat = st.executeUpdate(qry);
			if(stat>0) {
				System.out.println("Data Deleted!");
			}
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}