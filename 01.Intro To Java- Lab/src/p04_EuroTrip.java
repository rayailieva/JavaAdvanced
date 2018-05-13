import java.math.BigDecimal;
import java.util.Scanner;

public class p04_EuroTrip {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       double quantity = scanner.nextDouble();

       double inLevs = quantity * 1.20;

       BigDecimal marks = new BigDecimal("4210500000000").multiply(new BigDecimal(inLevs));

        System.out.printf("%.2f marks", marks);
    }
}
