import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class p03CustomMinFunc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for(String s : line){
            numbers.add(Integer.parseInt(s));
        }

        System.out.println(Collections.min(numbers));
    }
}
