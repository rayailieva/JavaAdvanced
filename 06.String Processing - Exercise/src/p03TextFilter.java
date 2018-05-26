import java.util.Scanner;

public class p03TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banned : bannedWords) {
            if(text.contains(banned)){
                String replacement = new String(new char[banned.length()]).replace("\0", "*");
                text = text.replaceAll(banned,replacement);
            }
        }

        System.out.println(text);
    }
}
