import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseLength = Integer.parseInt(reader.readLine());

        int[] inputs = new int[testCaseLength];

        for (int i = 0; i < testCaseLength; i++) {
            inputs[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(inputs);
        writer.write(Math.max(inputs[0] * inputs.length, inputs[inputs.length - 1])+"");
        writer.flush();
        writer.close();
    }
}
