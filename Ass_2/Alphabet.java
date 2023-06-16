import java.util.*;
public class Alphabet {
 public static void main(String[]args) {
  
  Scanner in = new Scanner(System.in);

  System.out.print("Enter an alphabet: ");
  char c = in.next().charAt(0);

  if(Character.isLetterOrDigit(c) == false)
  {
   System.out.println("wrong input");
  }
  else if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'||c=='E' ||c=='I' ||c=='O' ||c=='U')
  {
   System.out.println("The alphabet is vowel");
  }
  else{
   System.out.println("The alphabet is consonent");
  }
 }
}
