import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p13SentenceExtractor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String keyword = scanner.nextLine();
        String text = scanner.nextLine();

        String pattern = "[A-Z].+?[.!?]";
        String patternKey = "\\b" + keyword + "\\b";

        Pattern regex = Pattern.compile(pattern);
        Pattern regexKey = Pattern.compile(patternKey);

        List<String> sentences = new ArrayList<>();

        Matcher matcher = regex.matcher(text);
        while (matcher.find()) {
            sentences.add(matcher.group());
        }

        for (String sentence : sentences) {
            Matcher keyMatcher = regexKey.matcher(sentence);
            if (keyMatcher.find()) {
                System.out.println(sentence);
            }
        }
    }
}
