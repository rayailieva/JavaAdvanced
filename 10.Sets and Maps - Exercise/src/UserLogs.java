import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String,LinkedHashMap<String,Integer>> data = new TreeMap<>();

        while (!input.equals("end")){

            String[] tokens = input.split(" ");
            String IP = tokens[0].substring(3);
            String user = tokens[2].substring(5);

            if(!data.containsKey(user)){
                data.put(user, new LinkedHashMap<>());
            }
            if(!data.get(user).containsKey(IP)){
                data.get(user).put(IP, 1);
            }else{
                data.get(user).put(IP, data.get(user).get(IP) + 1);
            }

            input = scanner.nextLine();
        }


        for(String user : data.keySet()){
            System.out.println(user + ": ");

            int count = data.get(user).keySet().size();

            for(String el : data.get(user).keySet()){
                count--;
                if(count > 0) {
                    System.out.print(el + " => " + data.get(user).get(el) + ", ");
                }
                else{
                    System.out.print(el + " => " + data.get(user).get(el) + ".\n");
                }
            }
        }
    }

}
