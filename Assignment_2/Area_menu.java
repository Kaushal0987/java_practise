import java.util.*;
public class Area_menu {
 public static void main(String[]args) {
  
  Scanner in = new Scanner (System.in);

  double area, length, breadth, height, base, radius;

  System.out.println("Enter a shape to calculate area");
  System.out.print("options: circle\n         square\n         rectangle\n         triangle\n");
  String shape = in.next();

  switch(shape)
  {
   case "circle":
   System.out.print("Enter the radius of the circle: ");
   radius = in.nextDouble();
   area = Math.PI*radius*radius;
   System.out.println("Area of circle = "+(area));
   break;

   case "square":
   System.out.print("Enter the length of the square: ");
   length = in.nextDouble();
   area = length*length;
   System.out.println("Area of square = "+(area));
   break;

   case "rectangle":
   System.out.print("Enter the length and breadth of the rectangle: ");
   length = in.nextDouble();
   breadth = in.nextDouble();
   area = length*breadth;
   System.out.println("Area of rectangle = "+(area));
   break;

   case "triangle":
   System.out.print("Enter the height and base of the triangle: ");
   height = in.nextDouble();
   base = in.nextDouble();
   area = (1.0/2.0)*base*height;
   System.out.println("Area of Triangle = "+(area));
   break;

   default:
   System.out.println("Wrong input");
   break;
  }
 }
}
