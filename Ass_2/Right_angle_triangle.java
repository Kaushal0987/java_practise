import java.util.*;
public class Right_angle_triangle {
 public static void main(String[]args) {
  
  Scanner in = new Scanner (System.in);

  System.out.print("Enter the number of rows: ");
  int n = in.nextInt();

  for(int i=0; i<=n; i++)
  {
   int a=1;
   System.out.println();
   for(int j=0; j<i; j++)
   {
    System.out.print(a);
    a++;
   }
  }
 }
}
