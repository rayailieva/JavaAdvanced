import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class p08_ProductOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BigInteger product = BigInteger.ONE;

        do{
            BigInteger number = new BigInteger("" + n);
            product = product.multiply(number);
            n++;
        }while (n <= m);

        System.out.printf("product[%d..%d] = %d\n", n, m, product);
    }
}
