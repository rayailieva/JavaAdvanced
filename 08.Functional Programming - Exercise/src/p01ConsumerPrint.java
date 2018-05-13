import java.util.Scanner;
import java.util.function.Consumer;

public class p01ConsumerPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Consumer<String> print = w -> System.out.println(w);

        for(String word : words){
            print.accept(word);
        }
    }
}
