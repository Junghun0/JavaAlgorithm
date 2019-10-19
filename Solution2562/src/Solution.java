import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] tmpArray = new int[9];

        for (int i = 0; i < 9; i++) {
            tmpArray[i] = Integer.parseInt(reader.readLine());
        }

        int max = tmpArray[0];
        int maxIndex = 1;
        for (int i = 0; i < tmpArray.length; i++) {
            if (max < tmpArray[i]) {
                max = tmpArray[i];
                maxIndex = i + 1;
            }
        }

        writer.write(max + "");
        writer.newLine();
        writer.write(maxIndex + "");
        writer.flush();
        writer.close();
    }
}
