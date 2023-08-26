import java.util.Scanner;
public class ClockDemo {
 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);

  System.out.print(Enter the seconds of the first clock);
  int seconds = in.nextInt();

  Clock firstClock = new Clock(seconds);

  for(int i=0; i<10; i++)
  {
   firstClock.tick();
   System.out.println("First Clock: " + firstClock.toString());
  }


  System.out.print(Enter the hour of the second clock);
  int hr = in.nextInt();
  System.out.print(Enter the minutes of the second clock);
  int min = in.nextInt();
  System.out.print(Enter the seconds of the second clock);
  int sec = in.nextInt();

  Clock secondClock = new Clock(hr, min, sec);

  for(int j=0; j<10; j++)
  {
   secondClock.tick();
   System.out.println("second Clock: " + secondClock.toString());
  }


  firstClock.addClock(secondClock);
  System.out.println("First Clock: " + firstClock.toString());
  System.out.println("second Clock: " + secondClock.toString());


  Clock thirdClock = firstClock.subtractClock(secondClock);
  System.out.println("Third Clock: " + thirdClock.toString());
 }
}
