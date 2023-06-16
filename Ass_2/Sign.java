import java.util.*;
public class Sign {
 public static void main(String[]args) {

  Scanner in = new Scanner (System.in);

  System.out.print("Enter an integer: ");
  double n = in.nextDouble();

  if(n>0)
  {
   System.out.println("The number is positive");
   if(Math.abs(n)>1000000)
   {
    System.out.println("Large");
   }
   else if(Math.abs(n)<1)
   {
    System.out.println("Small");
   }
  }
  else if(n<0)
  {
   System.out.println("The number is negative");
  }
  else
  {
   System.out.println("The number is zero");
  }
  
 }
}
