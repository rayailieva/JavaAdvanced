import java.math.BigInteger;
import java.util.Scanner;

public class p02SumBigNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        BigInteger result = new BigInteger(num1).add(new BigInteger(num2));

        System.out.println(result);
    }
}
