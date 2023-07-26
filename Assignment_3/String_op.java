import java.util.Scanner;
import java.util.StringTokenizer;
public class String_op {
 public static void main(String []args){

  Scanner in = new Scanner(System.in);
  String string = new String();

  int vowel=0, consonent=0, digit=0, words=0, special_char=0;

  System.out.print("Enter the string: ");
  string = in.next();

  StringTokenizer tokens = new StringTokenizer(string);
  
  for(int i=0; i<string.length(); i++)
  {
   if(Character.isDigit(string.charAt(i)))
   {
    digit++;
   }
   else if(Character.isLetter(string.charAt(i)))
   {
    if(string.charAt(i)=='a' || string.charAt(i)=='A' || string.charAt(i)=='e' || string.charAt(i)=='E' || string.charAt(i)=='i' || string.charAt(i)=='I' || string.charAt(i)=='o' || string.charAt(i)=='O' || string.charAt(i)=='u' || string.charAt(i)=='U') 
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
  System.out.println("The total no of words are = "+tokens.countTokens());
  System.out.println("The total no of special character are = "+special_char);
  
 }
}
