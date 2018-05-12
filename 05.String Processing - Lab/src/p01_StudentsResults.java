import java.util.Scanner;

public class p01_StudentsResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] tokens = line.split(" - ");

        String name = tokens[0];
        String[] grades = tokens[1].split(", ");

        Double advanced = Double.parseDouble(grades[0]);
        Double OOP = Double.parseDouble(grades[0]);
        Double advancedOOP = Double.parseDouble(grades[0]);

        Double average = (advanced + OOP + advancedOOP) / 3;

        System.out.printf("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|\n"
                ,"Name","JAdv","JavaOOP","AdvOOP","Average");

        System.out.printf("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|\n"
                ,name,advanced,OOP,advancedOOP,average);
    }
}
