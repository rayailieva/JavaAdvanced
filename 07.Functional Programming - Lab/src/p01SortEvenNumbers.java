import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p01SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");
        List<Integer> numbers = new ArrayList<>();

        for(String s : line){
            numbers.add(Integer.valueOf(s));
        }

        numbers.removeIf(n -> n %2 != 0);

        System.out.println(numbers.toString().substring(1, numbers.toString().length() - 1));

        numbers.sort((a,b) -> a.compareTo(b));

        System.out.println(numbers.toString().substring(1, numbers.toString().length() - 1));

    }
}
