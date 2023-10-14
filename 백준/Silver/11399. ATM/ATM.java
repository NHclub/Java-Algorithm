import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] person = new int[n];

        for (int i = 0; i < n; i++) {
            person[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(person);
        int total = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += person[i];
            total += sum;
        }

        System.out.println(total);
    }
}