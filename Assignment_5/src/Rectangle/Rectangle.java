package Rectangle;

class Rectangle {
	 double length;
	 double breadth;

	 public Rectangle(double length, double breadth){
	  this.length = length;
	  this.breadth = breadth;
	 }

	 public void area(){
	  double area = length * breadth;
	  System.out.println("Area: "+area);
	 }

	 public void perimeter(){
	  double parimeter = 2 * (length+breadth);
	  System.out.println("Parimeter: "+parimeter);
	 }
	}

	class Square extends Rectangle{
	 public Square(double s) {
	  super(s, s);
	 }
	}
