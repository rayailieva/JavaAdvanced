import java.util.*;
import java.util.stream.Collectors;

public class Earthquake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<List<Integer>> queue = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt).collect(Collectors.toList());

            queue.offer(input);
        }

        ArrayDeque<Integer> outputQueue = new ArrayDeque<>();

        while (!queue.isEmpty()) {

            if (queue.peek().size() == 1) {
                outputQueue.offer(queue.poll().get(0));
                continue;
            }

            List<Integer> activity = queue.poll();

            for (int i = 1; i < activity.size(); i++) {
                int seismicity = activity.get(0);
                int wave = activity.get(i);

                if (seismicity >= wave) {
                    activity.remove(i);
                    i--;

                    if (activity.size() == 1) {
                        queue.offer(activity);
                    }

                } else {
                    activity.remove(0);
                    outputQueue.offer(seismicity);
                    queue.offer(activity);
                    break;
                }
            }
        }

        System.out.println(outputQueue.size());
        for (Integer num : outputQueue) {
            System.out.print(num + " ");
        }
    }
}
