import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCaseLength = Integer.parseInt(reader.readLine());
        List<int[]> inputList = new ArrayList<>();
        int rankNum = 0;


        for (int i = 0; i < testCaseLength; i++) {
            int[] inputArr = new int[2];
            String[] input = reader.readLine().split(" ");
            inputArr[0] = Integer.parseInt(input[0]);
            inputArr[1] = Integer.parseInt(input[1]);
            inputList.add(inputArr);
        }

        for (int i = 0; i < inputList.size(); i++) {
            for (int[] ints : inputList) {
                if (inputList.get(i)[0] < ints[0] && inputList.get(i)[1] < ints[1]) {
                    rankNum++;
                }
            }
            writer.write(rankNum+1+"");
            writer.newLine();
            rankNum = 0;
        }
        writer.flush();
        writer.close();
    }
}
