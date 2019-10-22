import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseLength = Integer.parseInt(reader.readLine());
        int[] countingArray = new int[testCaseLength];
        for (int i = 0; i < testCaseLength; i++) {
            int input = Integer.parseInt(reader.readLine());
            countingArray[i] = input;
        }

        Arrays.sort(countingArray);
        for (int value : countingArray) {
            writer.write(value + "");
            writer.newLine();
        }

        writer.flush();
        writer.close();
    }
}
