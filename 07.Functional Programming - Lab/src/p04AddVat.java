import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class p04AddVat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        List<Double> numbers = new ArrayList<>();

        for (String s : input){
            numbers.add(Double.parseDouble(s));
        }

        Function<Double, Double> addVat = x -> x * 1.20;

        System.out.println("Prices with VAT:");

        for(Double d: numbers){
            System.out.println(String.format("%1$.2f", addVat.apply(d)));
        }
    }
}
