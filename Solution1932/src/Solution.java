import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

        /*
           7
         3   8
       8   1   0
     2   7   4   4
   4   5   2   6   5

           7
        10   15
     18   16   15
   20   25   20   19
 24  30   27   26   23
       */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int topSize = Integer.parseInt(reader.readLine());
        List<int[]> topList = new ArrayList<>();

        for (int i = 0; i < topSize; i++) {
            String[] input = reader.readLine().split(" ");
            int[] inputData = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                inputData[j] = Integer.parseInt(input[j]);
            }
            topList.add(inputData);
        }

        for (int i = 1; i < topList.size(); i++) {

            for (int j = 0; j < topList.get(i).length; j++) {
                if (j == 0){
                    topList.get(i)[j] += topList.get(i-1)[j];
                } else if (j == topList.get(i).length - 1){
                    topList.get(i)[j] += topList.get(i-1)[topList.get(i-1).length - 1];
                } else{
                    topList.get(i)[j] = Math.max((topList.get(i)[j] + topList.get(i-1)[j-1]) , (topList.get(i)[j] + topList.get(i-1)[j]));
                }
            }
        }

        int max = topList.get(topList.size() - 1)[0];
        for (int i = 0; i < topList.get(topList.size() - 1).length; i++) {
            if (max < topList.get(topList.size() - 1)[i]){
                max = topList.get(topList.size() - 1)[i];
            }
        }
        writer.write(max+"");
        writer.flush();
        writer.close();
    }
}
