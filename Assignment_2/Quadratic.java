import java.util.*;
public class Quadratic {
 public static void main(String[]args) {

  Scanner in = new Scanner (System.in);

  System.out.print("Enter the three values of quadratic equation: ");
  double a = in.nextDouble();
  double b = in.nextDouble();
  double c = in.nextDouble();

  double root1, root2;

  double determinant = b*b-4*a*c;

  if(determinant>0)
  {
   System.out.println("The roots are real and distinct");
   root1 = (-b + Math.sqrt(determinant)) / (2 * a);
   root2 = (-b - Math.sqrt(determinant)) / (2 * a);
   System.out.println("First root:"+root1+"\nSecond root:"+root2); 
  }
  else if(determinant == 0)
  {
   System.out.println("The roots are real and equal");
   root1 = root2 = -b / (2 * a);
   System.out.println("First root:"+root1+"\nSecond root:"+root2);
  }
  else
  {
   System.out.println("Roots are complex number and distinct");
   double real = -b / (2 * a);
   double imaginary = Math.sqrt(-determinant) / (2 * a);
   System.out.println("Real root:"+real+"\nImaginary root:"+imaginary);
  }
 }
}