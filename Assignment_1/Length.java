import java.util.*;

public class Length {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length in inche: ");
        double inch = in.nextDouble();

        double meter = inch * 0.0254;

        System.out.print("length in meter: " + meter);

    }
}
