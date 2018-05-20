import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet<String> chemicalStuff = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++){
            String[] compounds = scanner.nextLine().split(" ");
            for(String element : compounds){
                chemicalStuff.add(element);
            }
        }

        for(String el : chemicalStuff){
            System.out.print(el + " ");
        }
    }
}
