import java.util.Scanner;

public class p01_RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double area = a * b;

        System.out.printf("%.2f", area);
    }
}
