import java.util.*;

public class Temperature {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = in.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9);

        System.out.println("Temperature in celsius: " + celsius);
    }
}