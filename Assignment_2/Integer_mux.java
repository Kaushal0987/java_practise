import java.util.*;
public class Integer_mux {
 public static void main(String[]args) {
  
  Scanner in = new Scanner (System.in);

  System.out.print("Enter an integer: ");
  int n = in.nextInt();

  System.out.print("Enter the limit of multiplication: ");
  int l = in.nextInt();

  for(int i=0; i<=l; i++)
  {
   System.out.format("%d x %d = %d\n",n,i,(n*i));
  }
 }
}
