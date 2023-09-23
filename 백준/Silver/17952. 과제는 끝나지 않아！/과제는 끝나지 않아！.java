import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> remainingTime = new Stack<>();
        Stack<Integer> score = new Stack<>();
        int sum = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            if (remainingTime.isEmpty() && str[0].equals("0")) {
                continue;
            }
            if (str[0].equals("0")) {
                int count = remainingTime.pop();
                remainingTime.push(count - 1);
            } else {
                score.push(Integer.parseInt(str[1]));
                remainingTime.push(Integer.parseInt(str[2])-1);
            }
            if (remainingTime.peek() == 0) {
                sum += score.pop();
                remainingTime.pop();
            }
        }
        System.out.println(sum);
    }
}