public class Main_class {
 public static void main(String[]args){

  Students s1 = new Students();

  s1.setID(1);
  s1.setName("kaushal joshi");
  s1.setFee(6000);

  System.out.println("ID = "+s1.getID());
  System.out.println("Name = "+s1.getName());
  System.out.println("Fee = "+s1.getFee());

  Constructor c1 = new Constructor();
  Constructor c2 = new Constructor(3.2);

  System.out.println("Grade: "+c2.grade);

 }
}
