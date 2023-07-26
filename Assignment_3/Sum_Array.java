import java.util.Scanner;
public class Sum_Array{
 public static void main(String[]args){

  Scanner in = new Scanner(System.in);
  int arrSum[] = new int[50];

  int n, sum=0;

  System.out.print("Enter the no of elements: ");
  n = in.nextInt();

  System.out.print("Enter the elements of the array: ");
  for(int i=0; i<n; i++){
   arrSum[i] = in.nextInt();
  }

  for(int j=0; j<n; j++){
   sum += arrSum[j];
  }
  System.out.println("The sum of all elements of the array are = "+sum);
 }
}