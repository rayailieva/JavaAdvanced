import java.util.*;

public class VLogger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Vlogger> vloggers = new HashMap<>();

        while (!input.equals("Statistics")) {

            String[] tokens = input.split(" ");
            String username = tokens[0];

            if (!vloggers.containsKey(username) && tokens[1].equals("joined")) {
                vloggers.put(username, new Vlogger(username));
            }
            else if(vloggers.containsKey(username) && tokens[1].equals("followed")) {
                String followedUser = tokens[2];
                vloggers.get(username).followers.add(username);
                vloggers.get(username).following.add(followedUser);
            }

            input = scanner.nextLine();
        }

        StringBuilder result = new StringBuilder();
        result.append(String.format("The V-Logger has a total of %d vloggers in its logs.%n", vloggers.size()));
        final int[] count = {1};
        final boolean[] isFirst = {true};

        vloggers.values().stream().sorted()
                .forEachOrdered(
                        vlogger -> {
                            result.append(String.format("%d%s", count[0]++, vlogger.getInfo(isFirst[0])));
                            isFirst[0] = false;
                        });

        System.out.println(result);
    }

    private static class Vlogger implements Comparable<Vlogger> {
        String name;
        Set<String> followers;
        Set<String> following;

        Vlogger(String name) {
            this.name = name;
            followers = new TreeSet<>();
            following = new HashSet<>();
        }

        String getInfo(boolean showFollowers){
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(". %s : %d followers, %d following%n", name, followers.size(), following.size()));
            if(showFollowers){
                for(String follower : followers){
                    sb.append((String.format("*  %s%n", follower)));
                }
            }
            return sb.toString();
        }

        public int compareTo(Vlogger other){
            if (followers.size() != other.followers.size()) {
                return Integer.compare(other.followers.size(), followers.size());
            }

            return Integer.compare(following.size(), other.following.size());
        }

    }
}
