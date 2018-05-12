import java.util.Scanner;

public class p04UnicodeCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        for (char charac : input) {

            String unicode = toUnicode(charac);

            System.out.printf("%s", unicode);
        }
    }

    private static String toUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}
