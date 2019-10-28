import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseLength = Integer.parseInt(reader.readLine());
        int[] inputData = new int[testCaseLength];
        int[] result = new int[testCaseLength];
        String[] inputs = reader.readLine().split(" ");

        for (int i = 0; i < testCaseLength; i++) {
            inputData[i] = Integer.parseInt(inputs[i]);
        }

        for (int i = 0; i < inputData.length; i++) {
            int test = inputData[i];
            for (int j = i+1; j < inputData.length; j++) {
                int number;
                if (test < inputData[j]){
                    number = inputData[j];
                    result[i] = number;
                    break;
                }
            }
            if (result[i] == 0) {
                result[i] = -1;
            }
            writer.write(result[i]+" ");
        }

        writer.flush();
        writer.close();
    }
}
