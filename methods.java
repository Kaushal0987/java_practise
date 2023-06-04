public class Methods {
 public static void main(String[]args)
 {
   String name = addSurname("kaushal");
   System.out.println(name.toUpperCase());
 }

 public static String addSurname(String s)
 {
   return s + "joshi";
 }
}