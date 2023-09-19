import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] monthArr = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = br.readLine();
        StringTokenizer st = new StringTokenizer(date);

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int result = monthArr[month-1] + day;

        if (result % 7 == 1) {
            System.out.println("MON");
        } else if (result % 7 == 2) {
            System.out.println("TUE");
        }else if (result % 7 == 3) {
            System.out.println("WED");
        }else if (result % 7 == 4) {
            System.out.println("THU");
        }else if (result % 7 == 5) {
            System.out.println("FRI");
        }else if (result % 7 == 6) {
            System.out.println("SAT");
        }else if (result % 7 == 0) {
            System.out.println("SUN");
        }
    }
}