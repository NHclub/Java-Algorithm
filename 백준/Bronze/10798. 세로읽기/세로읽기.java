import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        char[][] chars = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            if (str.length() > max) max = str.length();
            for (int j = 0; j < str.length(); j++) chars[i][j] = str.charAt(j);
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) if (chars[j][i] != '\0') sb.append(chars[j][i]);
        }
        System.out.println(sb);
    }
}