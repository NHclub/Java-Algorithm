import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }


        while (!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && day >= queue.peek()) {
                queue.poll();
                count++;
            }

            result.add(count);
        }


        return result;
    }
}