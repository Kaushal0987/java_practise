import java.util.*;
public class Odd {
 public static void main(String[]args) {
  
  Scanner in = new Scanner (System.in);
  
  int sum = 0;
  
  System.out.print("Enter the value of n: ");
  int n = in.nextInt();

  for(int i=1; i<n; i+=2)
  {
   sum += i;
   System.out.println("\t"+i);
  }

  System.out.println("Sum = "+sum);
 }
}
