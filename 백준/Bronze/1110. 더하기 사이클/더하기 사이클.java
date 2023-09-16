import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(bf.readLine());
        int count = 0;

        if (firstNumber < 10) {
            firstNumber = firstNumber * 10;
        }

        int result = firstNumber;


        while (true) {
            int one = result % 10;
            int ten = result / 10;
            int sum = one + ten;
            result = one * 10 + sum % 10;
            count += 1;

            if (result == firstNumber) {
                System.out.println(count);
                break;
            }

        }

    }

}
