public class Constructor {
 private double grade;

 public Constructor()
 {
  System.out.println("Default Constructor called");
 }

 public Constructor(double grade)
 {
  System.out.println("Parameterized constructor called");
  this.grade = grade;
 }

 public double Constructor(double grade)
 {
  return grade;
 }
}
