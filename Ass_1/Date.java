import java.util.*;

public class Date {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter munites to be converted: ");
        int min = in.nextInt();

        int years = min / 525600;
        int rem = min % 525600;
        int days = rem / 1440;

        System.out.println(years + "years\t" + days + "days");
    }
}
