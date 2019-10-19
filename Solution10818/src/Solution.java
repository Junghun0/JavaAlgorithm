import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseLength = Integer.parseInt(reader.readLine());
        int[] tmpArray = new int[testCaseLength];

        String[] tmp = reader.readLine().split(" ");
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(tmpArray);
        writer.write(tmpArray[0]+" "+tmpArray[tmpArray.length-1]);
        writer.flush();
        writer.close();
    }
}
