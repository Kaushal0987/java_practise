import java.util.Scanner;
public class Transpose {
 public static void main(String []args){

  Scanner in = new Scanner(System.in);
  int arr_trans[][] = new int[10][100];
  int temp=0, i, j;

  //input of rows and column of the matrix
  System.out.print("Enter the no rows of the matrix: ");
  int rows = in.nextInt();
  System.out.print("Enter the no of column of the matrix: ");
  int column = in.nextInt();

  //input of the elements of the matrix
  System.out.print("Enter the elements of the array: ");
  for(i=0; i<rows; i++){
   for(j=0; j<column; j++){
    arr_trans[i][j] = in.nextInt(); 
   }
  }

  //printing the original matrix
  System.out.println("The original matrix is: ");
  for(i=0; i<rows; i++){
   for(j=0; j<column; j++){
    System.out.print(arr_trans[i][j]+"\t");
   }
   System.out.println();
  }

  //transpose of the matrix
  for(i=0; i<rows; i++){
   for(j=0; j<column; j++){
    temp = arr_trans[i][j];
    arr_trans[i][j] = arr_trans[j][i];
    arr_trans[j][i] = temp;
   }
  }

  //printing the transposed matrix
  System.out.println("The transpose of the matrix is: ");
  for(i=0; i<rows; i++){
   for(j=0; j<column; j++){
    System.out.print(arr_trans[i][j]+"\t");
   }
   System.out.println();
  }

 }
}
