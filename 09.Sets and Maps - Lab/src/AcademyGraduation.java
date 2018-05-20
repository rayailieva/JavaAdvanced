import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double[]> results = new TreeMap<>();

        for(int i = 0; i < n; i++){
            String name = scanner.nextLine();
            String[] gradesStrings = scanner.nextLine().split(" ");
            Double[] grades = new Double[gradesStrings.length];

            for(int j = 0; j < gradesStrings.length; j++){
                grades[j] = Double.parseDouble(gradesStrings[j]);
            }
            results.put(name, grades);
        }

        for(String studentName: results.keySet()){

            System.out.println(studentName + " is graduated with " + results.get(studentName));
        }
    }
}
