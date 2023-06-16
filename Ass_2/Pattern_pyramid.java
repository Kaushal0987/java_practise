import java.util.*;
public class Pattern_pyramid {
public static void main(String[]args) {
 
 Scanner in = new Scanner (System.in);

 System.out.print("Enter the number of rows: ");
 int n = in.nextInt();

 int a=0;
 for(int i=0; i<=n; i++)
 {
  for(int j=0; j<=n-i; j++)
  {
   System.out.print(" ");
  }
  for(int k=1; k<=2*i-1; k++)
  {
   System.out.print(a);
  }
  System.out.println();
  a++;
 }
}
}
