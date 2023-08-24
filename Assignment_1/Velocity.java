import java.util.*;
public class Velocity {
 public static void main(String[]args){

  Scanner in = new Scanner(System.in);

  System.out.print("Enter the distance in meters: ");
  double dis = in.nextDouble();

  System.out.println("Enter the time taken");
  System.out.print("Hours: ");
  double hr = in.nextDouble();
  System.out.print("Minutes: ");
  double min = in.nextDouble();
  System.out.print("Seconds: ");
  Double sec = in.nextDouble();

  double meterSec = dis/((hr*3600)+(min*60)+sec);
  double kiloHour = meterSec*(3600/1000);
  double milesHour = kiloHour*(0.621371192237334);

  System.out.println("Your speed in meters per seconds = "+meterSec);
  System.out.println("Your speed in kilometer per hour = "+kiloHour);
  System.out.println("Your speed in miles per hour = "+milesHour);
 }
}
