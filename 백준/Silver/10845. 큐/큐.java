import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] word = br.readLine().split(" ");
            switch (word[0]) {
                case "push":
                    queue.offer(Integer.parseInt(word[1]));
                    break;
                case "pop":
                    if (!queue.isEmpty()) System.out.println(queue.poll());
                    else System.out.println(-1);
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    if (!queue.isEmpty()) System.out.println(queue.peek());
                    else System.out.println(-1);
                    break;
                case "back":
                    if (!queue.isEmpty()) System.out.println(queue.peekLast());
                    else System.out.println(-1);
                    break;
            }

        }
    }
}
