import java.util.Scanner;
import java.util.StringTokenizer;
public class String_Sequence {
 public static void main(String []args){

  int status=0;
  
  Scanner in = new Scanner(System.in);
  String str = new String();
  StringTokenizer seq = new StringTokenizer("Programming in java and python is easy"," ");

  System.out.print("Enter the string to compare: ");
  str = in.next();

  while(seq.hasMoreTokens()){
   if(str.equals(seq.nextElement())){
    status = 1;
   }
  }
  
  if(status==1){
   System.out.println("True");
  }
  else{
   System.out.println("False");
  }
 }
}
