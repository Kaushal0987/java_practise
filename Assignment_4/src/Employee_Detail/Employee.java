package Employee_Detail;

public class Employee {
	
	private String name;
	private int year_of_joining;
	private String address;
	
	public Employee(String name, int year_of_joining, String address) {
		this.name = name;
		this.year_of_joining = year_of_joining;
		this.address = address;
	}
	
	public void output() {
		System.out.println(name+"\t\t"+year_of_joining+"\t\t"+address);
	}

}
