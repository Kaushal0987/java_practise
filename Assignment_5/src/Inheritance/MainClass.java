package Inheritance;

public class MainClass {
	 public static void main(String[] args){
	  //calling parent method from parent object.
	  Inheritance i = new Inheritance();
	  i.print();

	  //calling child method from child object.
	  subclass s = new subclass();
	  s.display();

	  //calling parent method from child object.
	  s.print();
	 }
	}
