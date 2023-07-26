package Student_Data;

public class Student_Data {

	public static void main(String[] args) {
		
		Student S1 = new Student();
		Student S2 = new Student();
		
		S1.setData("Sam", 1, 984865135, "Kathmandu, Babarmahal");
		S1.display();
		
		S2.setData("john", 2, 986512546, "Kathmandu, Baneshwor");
		S2.display();
	}

}
