import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 1;

        for (int i = 0; i < n; i++) {
            int currentStudent = Integer.parseInt(st.nextToken());
            if (currentStudent == count) {
                count++;
                while (!stack.isEmpty() && stack.peek() == count) {
                    stack.pop();
                    count++;
                }
            } else {
                stack.push(currentStudent);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == count) {
                stack.pop();
                count++;
            } else {
                break;
            }
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");


    }

}