import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Integer>> data = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            String IP = tokens[0];
            String user = tokens[1];
            int duration = Integer.parseInt(tokens[2]);

            if (data.containsKey(user)) {

                if (data.get(user).containsKey(IP)) {
                    data.get(user).put(IP, data.get(user).get(IP) + duration);
                } else {
                    data.get(user).put(IP, duration);
                }
            } else {
                data.put(user, new TreeMap<>());
            }

            for (String username : data.keySet()) {
                System.out.print(username + ": " + data.get(username).get(IP) + " ");

                for (String ip : data.get(username).keySet()) {
                    System.out.printf("[%s]", ip);

                }
            }
        }
    }
}
