import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        HashSet<String> vip = new HashSet<>();
        TreeSet<String> regular = new TreeSet<>();

        while(true) {

            String input = scanner.nextLine();

            if(input.equals("PARTY")){
                break;
            }else{
                String sign = Character.toString(input.charAt(0));
                if(input.contains(sign)){
                    vip.add(input);
                }else{
                    regular.add(input);
                }
            }

            while(!input.equals("END")){
               input = scanner.nextLine();

                 {
                    if(vip.contains(input)){
                        vip.remove(input);
                    }
                    if(regular.contains(input)){
                        regular.remove(input);
                    }
                }
            }
        }

        regular.addAll(vip);

       for(String guest : regular){
           System.out.println(guest);
       }
    }
}
