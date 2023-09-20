import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String num = br.readLine();

            if (num.equals("0")) {
                break;
            }

            String numLeft;
            String numRight;

            if (num.length() % 2 == 0) {
                numLeft = num.substring(0, (num.length() / 2));
                numRight = num.substring(num.length() / 2);
            } else {
                numLeft = num.substring(0, (num.length() / 2));
                numRight = num.substring((num.length() / 2) + 1);
            }

            StringBuffer sb = new StringBuffer(numRight);
            String reversedNumRight = sb.reverse().toString();

            if (numLeft.equals(reversedNumRight)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}