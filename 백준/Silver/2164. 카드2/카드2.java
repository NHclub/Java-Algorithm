import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> card = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            card.offer(i);
        }

        while (card.size() != 1) {
            card.poll();
            card.offer(card.poll());
        }

        System.out.println(card.peek());
    }
}