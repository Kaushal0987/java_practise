import java.util.Scanner;
public class String_Compare {
 public static void main(String []args){
  
  Scanner in = new Scanner(System.in);
  String string_1 = new String();
  String string_2 = new String();

  System.out.print("Enter the 1st string: ");
  string_1 = in.nextLine();
  System.out.print("Enetr the 2nd string: ");
  string_2 = in.nextLine();

  int value = string_1.compareTo(string_2);

  if(value==0){
   System.out.println(string_1+" > "+string_2);
  }
  else{
   System.out.println(string_2+" > "+string_1);
  }
 }
}
