import java.util.*;
import java.util.stream.Collectors;

public class Ranking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> contestInfo = new HashMap<>();
        TreeMap<String, HashMap<String, Integer>> usersData = new TreeMap<>();

        String contests = scanner.nextLine();

        while(!contests.equals("end of contests")){
            String[] tokens = contests.split(":");
            String contest = tokens[0];
            String passwordForContest = tokens[1];

            contestInfo.put(contest,passwordForContest);

            contests = scanner.nextLine();
        }

        String input = scanner.nextLine();

        boolean isValidContest = false;
        boolean isValidPass = false;

        while(!input.equals("end of submissions")){
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if(contestInfo.containsKey(contest)){
                isValidContest = true;
            }
            if(contestInfo.get(contest).equals(password)){
                isValidPass = true;
            }
            if(isValidContest && isValidPass){
                if(!usersData.containsKey(username)) {
                    usersData.put(username, new HashMap<>());
                }
                if(!usersData.get(username).containsKey(contest)){
                    usersData.get(username).put(contest, points);
                }
                if(usersData.get(username).containsKey(contest)){
                    int initialPoints = usersData.get(username).get(contest);
                    if(initialPoints < points){
                        usersData.get(username).put(contest, points);
                    }
                }
            }
            input = scanner.nextLine();
        }

        Map<String, Map<String,Integer>> sortedUsers =
                usersData.entrySet().stream()
                        .sorted((user1,user2) ->{
                            int user1points =
                                    user1.getValue()
                                            .values()
                                            .stream()
                                            .mapToInt(Integer::valueOf)
                                            .sum();
                            int user2points =
                                    user2.getValue()
                                            .values()
                                            .stream()
                                            .mapToInt(Integer::valueOf)
                                            .sum();
                            int comparator = Integer.compare(user2points,user1points);
                            return comparator;
                        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        for(String winner : sortedUsers.keySet()) {

            System.out.println("Best candidate is " + winner + " with total " + sortedUsers
                    .get(winner)
                    .values()
                    .stream()
                    .mapToLong(Long::valueOf)
                    .sum() + " points.");
            System.out.println("Ranking: ");

            break;
        }
        for(var user : usersData.entrySet()){

            Map<String, Integer> points = user.getValue();
            Map<String, Integer> sortedByPoints =
                    points.entrySet()
                            .stream()
                            .sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

            System.out.println(user.getKey());

            for(var data : sortedByPoints.entrySet()){
                System.out.println("#  " + data.getKey() + " -> " + data.getValue());
            }
        }
    }
}
