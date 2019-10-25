import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(reader.readLine());
        int[] testCases = new int[input + 1];

        testCases[0] = 0;
        testCases[1] = 1;
        testCases[2] = 2;

        for (int i = 3; i < testCases.length; i++) {
            testCases[i] = testCases[i - 2] + testCases[i - 1];
            testCases[i] %= 15746;
        }

        writer.write(testCases[input]+"");
        writer.flush();
        writer.close();
    }
}
