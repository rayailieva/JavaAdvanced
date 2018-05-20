import java.util.Scanner;

public class p01CountOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine().toLowerCase();

        int counter = 0;
        int index = text.indexOf(word);

        while (index != -1) {
            counter++;
            index = text.indexOf(word, index + 1);
        }
        System.out.println(counter);
    }
}
