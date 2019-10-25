import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int stairLength = Integer.parseInt(reader.readLine());
        int[] stepScore = new int[stairLength];

        for (int i = 0; i < stairLength; i++) {
            stepScore[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(Arrays.toString(stepScore));

        /*
        1 -> 1,1 / 2
        * */
    }
}
