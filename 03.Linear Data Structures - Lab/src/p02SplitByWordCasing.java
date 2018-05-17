import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02SplitByWordCasing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] words = text.split("[.!,/()'\\\\\";:\\[\\] ]");

        List<String> lowerCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();

        int lowerCount = 0;
        int upperCount = 0;

        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(Character.isLowerCase(word.charAt(lowerCount))){
                    lowerCount++;
                    if(lowerCount == word.length()){
                        lowerCase.add(word);
                    }
                }
                if(Character.isUpperCase(word.charAt(upperCount))){
                    upperCount++;
                    if(upperCount == word.length()){
                        upperCase.add(word);
                    }
                }
                else {
                    mixedCase.add(word);
                }
            }
        }

        System.out.println("Lower-case: " + String.join(", ", lowerCase));
        System.out.println("Mixed-case: " + String.join(", ", mixedCase));
        System.out.println("Upper-case: " + String.join(", ", upperCase));
    }
}
