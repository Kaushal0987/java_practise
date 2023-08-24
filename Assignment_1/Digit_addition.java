import java.util.*;

public class Digit_addition {
    public static void main(String[] args) {

        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer between 0 to 1000: ");
        int n = in.nextInt();

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        System.out.print("sum of the digit of the given integer value: " + sum);
    }
}
