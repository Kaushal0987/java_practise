import java.util.Scanner;
public class Index_Char {
 public static void main(String []args){

  Scanner in = new Scanner(System.in);
  String word = new String();

  System.out.print("Enter a string: ");
  word = in.next();

  System.out.print("Write the index of character you want to print: ");
  int index = in.nextInt();

  System.out.println("The character at the given index is = "+word.charAt(index-1));
 }
}
