import java.util.Scanner;
public class Matrix_Sum {
 public static void main(String []args){

  Scanner in = new Scanner(System.in);
  int array[][] = new int[10][100];
  int sum=0;

  System.out.print("Enter the no rows of the matrix: ");
  int rows = in.nextInt();

  System.out.print("Enter the no of column of the matrix: ");
  int column = in.nextInt();

  System.out.print("Enter the elements of the array: ");
  for(int i=0; i<rows; i++){
   for(int j=0; j<column; j++){
    array[i][j] = in.nextInt(); 
   }
  }

  System.out.println("Array: ");
  for(int i=0; i<rows; i++){
   for(int j=0; j<column; j++){
    System.out.print(array[i][j]+"\t");
   }
   System.out.println();
  }

  for(int i=0; i<rows; i++){
   for(int j=0; j<column; j++){
    sum+=array[i][j];
   }
   System.out.println("sum of row "+i+" = "+sum);
   sum=0;
  }

  for(int i=0; i<column; i++){
   for(int j=0; j<rows; j++){
    sum+=array[j][i];
   }
   System.out.println("sum of column "+i+" = "+sum);
   sum=0;
  }

 }
}
