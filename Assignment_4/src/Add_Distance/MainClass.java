package Add_Distance;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the distance in inch: ");
		double inch = in.nextDouble();
		System.out.print("Enter the distance in feet: ");
		double feet = in.nextDouble();
		
		Add_Distance D1 = new Add_Distance(inch, feet);
		
		System.out.print("The Sum of the distance = "+D1.result()+"inches");
		}

}
