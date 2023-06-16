import java.util.*;
public class Arithmetic_op {
 public static void main(String[]args) {
  
  Scanner in = new Scanner (System.in);

  System.out.print("Enter two numbers: ");
  double x = in.nextDouble();
  double y = in.nextDouble();

  System.out.println("Select an arthematic operation");
  System.out.print("'+'\n'-'\n'*'\n'/'\n Enter your choice: ");
  char op = in.next().charAt(0);

  switch(op)
  {
   case '+':
    System.out.println("Addition = "+(x+y));
   break;

   case '-':
    System.out.println("Subtraction = "+(x-y));
   break;

   case '*':
    System.out.println("Multiplication = "+(x*y));
   break;

   case '/':
    System.out.println("Division = "+(x/y));
   break;

   default:
    System.out.println("Wrong input");
   break;
   }
 }
}
