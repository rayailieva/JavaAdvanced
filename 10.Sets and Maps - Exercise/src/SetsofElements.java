import java.util.HashSet;
import java.util.Scanner;

public class SetsofElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] lengths = scanner.nextLine().split(" ");
        int n = Integer.parseInt(lengths[0]);
        int m = Integer.parseInt(lengths[1]);

        HashSet<Integer> firstSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();

        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for(int i = 0; i < m; i++){
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        for(int num : firstSet){
           for(int numm : secondSet){
               if(num == numm){
                   System.out.print(num + " ");
               }
           }
        }
    }
}
