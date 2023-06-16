import java.util.*;
public class Natural_num {
 public static void main(String[]args) {
  
  Scanner in = new Scanner (System.in);

  double sum = 0;

  System.out.print("Enter the no of n: ");
  double n = in.nextDouble();

  for(int i=0; i<n; i++)
  {
   System.out.println("\t"+i);
   sum += i;
  }

  System.out.println("sum = "+sum+"\taverage = "+(sum/n));
 }
}
