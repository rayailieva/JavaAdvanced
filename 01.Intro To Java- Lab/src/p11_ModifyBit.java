import java.util.Scanner;

public class p11_ModifyBit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int v = scanner.nextInt();

        int mask = ~(v << p);
        int result = n & mask;

        System.out.println(result);
    }
}
