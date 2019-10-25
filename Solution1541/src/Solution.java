import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // 50 - 55 + 40
        String[] input = reader.readLine().split("\\-");
        int minResult = 0;
        for (int i = 0; i < input.length; i++) {
            int calcNum = calc(input[i]);

            if (i == 0) {
                calcNum *= -1;
            }
            minResult -= calcNum;
        }
        writer.write(minResult+"");
        writer.flush();
        writer.close();
    }

    private static int calc(String str) {
        String[] subNums = str.split("\\+");
        int result = 0;

        for (String item : subNums) {
            result += Integer.parseInt(item);
        }
        return result;
    }
}
