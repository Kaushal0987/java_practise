package Member;

public class MemberDemo {
	 public static void main(String[] args) {

	  Employee e = new Employee("John Doe", 28, 984852167, "123 Main St", 60000, "Java Developer");

	  Manager m = new Manager("Jane Smith", 35, 987654321, "456 Park Ave", 80000, "IT Department");

	  System.out.println("Employee Details:");
	  System.out.println("Name: " + e.name);
	  System.out.println("Age: " + e.age);
	  System.out.println("Phone Number: " + e.phone_no);
	  System.out.println("Address: " + e.address);
	  System.out.println("Salary: $" + e.salary);
	  System.out.println("Specialization: " + e.specialization);

	  System.out.println("\nManager Details:");
	  System.out.println("Name: " + m.name);
	  System.out.println("Age: " + m.age);
	  System.out.println("Phone Number: " + m.phone_no);
	  System.out.println("Address: " + m.address);
	  System.out.println("Salary: $" + m.salary);
	  System.out.println("Department: " + m.department);
	 }
	}

