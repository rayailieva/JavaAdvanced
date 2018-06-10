import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Internship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> problemsStack = new ArrayDeque<>();
        ArrayDeque<String> validNamesQueue = new ArrayDeque<>();

        List<String> leftCandidates = new ArrayList<>();

        String regex = ("^[A-Z][a-z]{2,}[ ]{1}[A-Z][a-z]{2,}$");

        for(int i = 0; i < n; i++){
            String problem = scanner.nextLine();
            problemsStack.push(problem);
        }
        for(int i = 0; i < m; i++){
            String name = scanner.nextLine();
            if(Pattern.matches(regex,name)){
                validNamesQueue.offer(name);
            }
        }
        boolean isSolved = false;

        while(validNamesQueue.size() != 1){

            if(problemsStack.size() == 0){
                for(String person : validNamesQueue){
                   leftCandidates.add(person);
                }
                System.out.print(String.join(",", leftCandidates));
                break;
            }

            String problemToSolve = problemsStack.pop();
            String candidate = validNamesQueue.poll();

            char[] problemChars = problemToSolve.toCharArray();
            char[] candidateChars = candidate.toCharArray();

            int problemValue = 0;
            int candidateValue = 0;

            for(char c : candidateChars){
                int ascii = (int) c;
                candidateValue += ascii;
            }

            for(char c : problemChars){
                int ascii = (int) c;
                problemValue += ascii;
            }

            if(candidateValue > problemValue){
                isSolved = true;
            }else{
                isSolved = false;
            }

            if(isSolved){
                problemsStack.remove(problemToSolve);
                validNamesQueue.addLast(candidate);
                System.out.println(candidate + " solved " + problemToSolve + ".");
            }else{
                problemsStack.addLast(problemToSolve);
                System.out.println(candidate + " failed " + problemToSolve + "." );
            }

            if(validNamesQueue.size() == 1){
                String onlyOneLeft = validNamesQueue.peek();
                System.out.println(onlyOneLeft + " gets the job!");
                break;
            }
        }
    }
}
