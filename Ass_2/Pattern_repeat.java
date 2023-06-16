import java.util.*;
public class Pattern_repeat {
 public static void main(String[]args) {
  
  Scanner in = new Scanner (System.in);

  System.out.print("Enter the number of rows: ");
  int n = in.nextInt();

  int a=0;
  for(int i=0; i<=n; i++)
  {
   System.out.println();
   for(int j=0; j<i; j++)
   {
    System.out.print(a);
   }
   a++;
  }
 }
}
