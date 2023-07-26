package Area_rectangle;
import java.util.Scanner;

public class Area_of_Rectangle {

	public static void main(String[] args) {
		
		Area A1 = new Area();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the value of length: ");
		int len = in.nextInt();
		System.out.print("Enter the value of breadth: ");
		int bth = in.nextInt();
		
		A1.setDim(len, bth);
		System.out.println("The area of rectangle is = "+A1.getArea());
	}

}
