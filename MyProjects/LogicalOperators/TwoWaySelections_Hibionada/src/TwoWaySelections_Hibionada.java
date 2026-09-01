import javax.util.*;

public class TwoWaySelections_Hibionada {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double elecConsumed, rate, bill;

        System.out.print("Enter electricity consumed: ");
        elecConsumed = console.nextDouble();

        System.out.println();

        System.out.print("Enter rate: ");
        rate = console.nextDouble();

        System.out.println();

        if (elecConsumed <= 50)
            bill = elecConsumed * rate;
        else
            bill = 50 * rate + 1.25 * rate * (elecConsumed - 50);

        System.out.printf("Bill is %.2f", bill);
    }
}
