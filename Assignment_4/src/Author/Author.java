package Author;

public class Author {
	private String firstName;
	private String lastName;
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getfirstName() {
		return firstName;
	}
		
	public String getlastName() {
			return lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
		
}
