import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> word = new Stack<>();
        String[] str = br.readLine().split("");
        boolean flag = false;


        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("<")) {
                flag = true;
                while (!word.isEmpty()) {
                    sb.append(word.pop());
                }
            }
            if (!flag && str[i].equals(" ")) {
                while (!word.isEmpty()) {
                    sb.append(word.pop());
                }
                sb.append(" ");
                continue;
            }
            if (flag) {
                sb.append(str[i]);
            } else {
                word.push(str[i]);
            }
            if (str[i].equals(">")) {
                flag = false;
            }
        }
        while (!word.isEmpty()) {
            sb.append(word.pop());
        }
        System.out.println(sb);

    }
}