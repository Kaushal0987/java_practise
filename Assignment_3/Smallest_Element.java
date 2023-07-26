import java.util.Scanner;
public class Smallest_Element{
 public static void main(String[]args){

  Scanner in = new Scanner(System.in);
  int Array[] = new int[50];

  int n;

  System.out.print("Enter the no of elements: ");
  n = in.nextInt();

  System.out.print("Enter the elements of the array: ");
  for(int i=0; i<n; i++){
   Array[i] = in.nextInt();
  }
 
  int item = Array[0];

  for(int j=0; j<n; j++){
   if(Array[j] < item){
    item = Array[j];
   }
  }
  
  System.out.println("Smallest element = "+item);
 }
}