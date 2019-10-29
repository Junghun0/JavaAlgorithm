import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");

        int hours = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);

        if (min < 45) {
            hours -= 1;
            int cal = 45 - min;
            min = 60 - cal;
        } else {
            min -= 45;
        }

        if (hours<0) {
            hours = 23;
        }

        System.out.println(hours+" "+min);
    }
}
