import java.util.Scanner;
import java.util.StringTokenizer;
public class String_op {
 public static void main(String []args){

  Scanner in = new Scanner(System.in);
  String string = new String();

  int vowel=0, consonent=0, digit=0, words=0, special_char=0, space=0;

  System.out.print("Enter the string: ");
  string = in.nextLine();

  StringTokenizer tokens = new StringTokenizer(string," ");
  
  for(int i=0; i<string.length(); i++)
  {
   char ch = string.charAt(i);

   if(Character.isWhitespace(ch)){
    space++;
   }
   else if(Character.isDigit(ch))
   {
    digit++;
   }
   else if(Character.isLetter(ch))
   {
    if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') 
    {
     vowel++;
    }
    else
    {
     consonent++;
    }
   }
   else
   {
    special_char++;
   }
  }

  System.out.println("The total no of vowels are = "+vowel);
  System.out.println("The total no of consonent are = "+consonent);
  System.out.println("The total no of digits are = "+digit);
  System.out.println("The total no of words are = "+(tokens.countTokens()));
  System.out.println("The total no of special character are = "+special_char);
  System.out.println("The total no of space are = "+space);
  
 }
}
