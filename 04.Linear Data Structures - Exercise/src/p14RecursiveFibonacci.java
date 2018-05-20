import java.util.Scanner;

public class p14RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(getFibonacci(num));
    }

    private static int getFibonacci(int n){
       if(n <= 1){
           return 1;
       }
       return getFibonacci(n -1)+ getFibonacci(n - 2);
    }
}
