import java.util.Scanner;
import java.util.function.Consumer;

public class p02KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Consumer<String> sirs = x -> System.out.println("Sir " + x);

        for(String word : words){
            sirs.accept(word);
        }
    }
}
