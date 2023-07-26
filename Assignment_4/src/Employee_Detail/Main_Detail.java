package Employee_Detail;

public class Main_Detail {

	public static void main(String[] args) {
		
		Employee E1 = new Employee("Robert", 1994, "64C-WallsStreat");
		Employee E2 = new Employee("Sam", 2000, "68D-WallsStreat");
		Employee E3 = new Employee("john", 1999, "26B-WallsStreat");
		
		System.out.println("Name\tYear_Of_Joining\t\taddress");
		
		E1.output();
		E2.output();
		E3.output();

	}
}
