import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p12ExtractEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        String regex = "^|\\s[a-z0-9][\\.\\_\\-a-z0-9]*[a-z0-9]@[a-z0-9][\\.\\-a-z0-9]*[a-z0-9]\\.[a-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            sb.append(matcher.group() + "\n");
        }

        System.out.println(sb.toString());
    }
}
