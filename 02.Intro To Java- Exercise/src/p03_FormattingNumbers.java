import java.util.Scanner;

public class p03_FormattingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String numInHex = Integer.toHexString(a).toUpperCase();
        String numberInBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        if (c % 1 == 0) {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", numInHex, numberInBinary, b, c);
        } else {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", numInHex, numberInBinary, b, c);
        }
    }
}
