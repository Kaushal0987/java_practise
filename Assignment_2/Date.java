import java.util.*;
public class Date {
 public static void main(String[]args) {

  Scanner in = new Scanner (System.in);

  System.out.print("Enter the month: ");
  String month = in.next();

  int days;


  if(month.compareToIgnoreCase("February")==0)
  {
   System.out.println("is it leap year? (y/n)");
    char ch = in.next().charAt(0);

    if(ch == 'y'||ch == 'Y')
    {
     days = 29;
     System.out.println(month+ " has " +days+ " days");
    }
    else
    {
     days = 28;
     System.out.println(month+ " has " +days+ " days ");
    }
  }
  else if(month.compareToIgnoreCase("April")==0 || month.compareToIgnoreCase("June")==0 || month.compareToIgnoreCase("September")==0 || month.compareToIgnoreCase("November")==0)
  {
    days = 30;
    System.out.println(month+ " has " +days+ " days");
  }
  else
  {
    days = 31;
    System.out.println(month+ " has " +days+ " days");
  }

  /*switch(month)
  {
   case "january":
   case "march":
   case "may":
   case "july":
   case "august":
   case "october":
   case "december":
    days = 31;
    System.out.println(month+ " has " +days+ " days");
    break;

   case "april":
   case "june":
   case "september":
   case "november":
    days = 30;
    System.out.println(month+ " has " +days+ " days");
    break;

   case "february":
    System.out.println("is it leap year? (y/n)");
    char ch = in.next().charAt(0);

    if(ch == 'y'||ch == 'Y')
    {
     days = 29;
     System.out.println(month+ " has " +days+ " days");
    }
    else
    {
     days = 28;
     System.out.println(month+ " has " +days+ " days ");
    }
    break;

   default:
    System.out.println("Wrong input");
    break;
  }*/
 }
}
