import java.util.*;
public class Integer_calc {
 public static void main(String[]args){

  Scanner in = new Scanner(System.in);

  System.out.print("Enter the two Integers: ");
  int num1 = in.nextInt();
  int num2 = in.nextInt();

  int sum = num1 + num2;
  int sub = num1 - num2;
  int mux = num1 * num2;
  double avg = (num1 + num2) / 2.0;

  System.out.println("Sum of two input integers = "+sum);
  System.out.println("Difference of two input integers = "+sub);
  System.out.println("Product of two integers = "+mux);
  System.out.println("Average of  two input integers = "+avg);

  if(sub>=0){
   System.out.println("The distance of two input integers = "+sub);
  }
  else{
   int dif = (~(sub - 1));
   System.out.println("The distance of two input integers = "+dif);
  }

  if(num1>num2){
   System.out.println("max integer = "+num1+"min integer = "+num2);
  }
  else{
   System.out.println("max integer = "+num2+"\nmin integer = "+num1);
  }
 }
}
