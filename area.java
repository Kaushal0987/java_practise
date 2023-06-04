import java.util.*;

class area {
	public static void main(String[] args) {
		
		System.out.print("Enter the value of radius: ");

		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();

		double a = (22 / 7) * r;

		System.out.println("Area of circle : " + a);

	}
}