import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");

        int width = Integer.parseInt(input[0]);
        int height = Integer.parseInt(input[1]);

        String[] chessArray = new String[height];

        for (int i = 0; i < height; i++) {
            String tmpArray = reader.readLine();
            chessArray[i] = tmpArray;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

            }
        }
    }
}
