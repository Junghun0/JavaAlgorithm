import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCaseLength = Integer.parseInt(bufferedReader.readLine());
        int[] tmpArray = new int[testCaseLength];
        int sum;

        for (int i = 0; i < testCaseLength; i++) {
            String[] sumArray = bufferedReader.readLine().split(" ");
            sum = Integer.parseInt(sumArray[0]) + Integer.parseInt(sumArray[1]);
            tmpArray[i] = sum;
        }

        for (int i = 0; i < testCaseLength; i++) {
            bufferedWriter.write("Case #"+(i+1)+": "+tmpArray[i]);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
