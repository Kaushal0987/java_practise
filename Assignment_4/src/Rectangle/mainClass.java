package Rectangle;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the length of rectangle: ");
		int length = in.nextInt();
		System.out.print("Enter the breadth of rectangle: ");
		int breadth = in.nextInt();
		
		Area A = new Area(length, breadth);
		
		System.out.println("The area of rectangle = "+A.returnArea());
		
		
	}

}
