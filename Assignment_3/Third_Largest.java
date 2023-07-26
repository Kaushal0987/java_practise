import java.util.Scanner;
public class Third_Largest {
 public static void main (String[]args){

  Scanner in = new Scanner(System.in);
  int arrTH[] = new int[50];

  System.out.print("Enter the no of elements: ");
  int n = in.nextInt();

  System.out.print("Enter the elements of the array: ");
  for(int i=0; i<n; i++){
   arrTH[i] = in.nextInt();
  }

  for(int j=0; j<n; j++){
   if(arrTH[j]<arrTH[j+1]){
    int temp = arrTH[j];
    arrTH[j] = arrTH[j+1];
    arrTH[j+1] = temp;
   }
  }

  System.out.println("The third largest element of the array is "+arrTH[2]);
 }
}
