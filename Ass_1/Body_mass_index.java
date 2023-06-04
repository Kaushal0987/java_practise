import java.util.*;
public class Body_mass_index{
 public static void main(String[]args){

  Scanner in = new Scanner(System.in);

  System.out.print("Enter weight in pounds: ");
  double wt = in.nextInt();

  System.out.print("Enter height in inches: ");
  double ht = in.nextInt();

  double BMI = 703.0*(wt/(ht*ht));

  System.out.println("Body mass index = "+BMI);
 }
}