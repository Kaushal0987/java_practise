package Complex_Number;

import java.util.*;
public class Complex_Demo {

	public static void main(String[] args) {
		
		double real, imaginary;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the real part of the Complex number: ");
		real = in.nextDouble();
		System.out.print("Enter the imaginary part of the Complex number: ");
		imaginary = in.nextDouble();
		
		Complex c1 = new Complex(real, imaginary);
		Complex c2 = new Complex(3, 7);
		
		Complex sum = c1.add(c2);
		Complex diff = c1.subtract(c2);
		Complex product = c1.multiply(c2);
		Complex div = c1.divide(c2);
		
		System.out.println("Number 1: " + c1);
		System.out.println("Number 2: " + c2);
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + product);
		System.out.println("Division: " + div);
	}

}
