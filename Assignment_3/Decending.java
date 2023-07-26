import java.util.Scanner;
public class Decending {
 public static void main (String[]args){

  Scanner in = new Scanner(System.in);
  int arrDec[] = new int[50];

  System.out.print("Enter the no of elements: ");
  int n = in.nextInt();

  System.out.print("Enter the elements of the array: ");
  for(int i=0; i<n; i++){
   arrDec[i] = in.nextInt();
  }

  for(int j=0; j<n; j++){
   if(arrDec[j]<arrDec[j+1]){
    int temp = arrDec[j];
    arrDec[j] = arrDec[j+1];
    arrDec[j+1] = temp;
   }
  }

  System.out.print("The elements of array in decending order are: ");
  for(int k=0; k<n; k++){
   System.out.print("\t"+arrDec[k]);
  }
 }
}
