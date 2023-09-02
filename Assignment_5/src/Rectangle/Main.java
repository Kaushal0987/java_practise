package Rectangle;

public class Main {
	 public static void main(String[] args) {
	  Rectangle r = new Rectangle(5, 8);
	  Square s = new Square(6);

	  System.out.println("Rectangle");
	  r.area();
	  r.perimeter();

	  System.out.println("Square");
	  s.area();
	  s.perimeter();
	 }
	}

