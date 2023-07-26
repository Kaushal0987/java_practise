package Student_Data;

public class Student {
	private String name;
	private int roll_no;
	private long phone_no;
	private String address;
	
	public void setData(String name, int roll_no, long phone_no, String address) {
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll no = "+roll_no);
		System.out.println("Phone no = "+phone_no);
		System.out.println("Address = "+address+"\n");
	}
}
