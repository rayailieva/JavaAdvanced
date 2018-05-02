import java.util.Scanner;

public class p01_CalculateArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        double area = calcArea(base,height);

        System.out.printf("Area = %.2f", area);
    }

    private static double calcArea(double base,double height){
        return (base* height) / 2;
    }
}
