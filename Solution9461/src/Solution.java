import java.io.*;

//6 -> 3 / 12-> 16
//1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37
//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14

//1, 1, 1, 2
//3 -> 0 + 1
//4 -> 1 + 2
//5 -> 2 + 3
//6 -> 3 + 4

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseLength = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCaseLength; i++) {
            int findIndex = Integer.parseInt(reader.readLine());
            writer.write(findNumber(findIndex)+"");
            writer.newLine();
        }

        writer.flush();
        writer.close();
    }

    private static long findNumber(int targetIndex){
        if (targetIndex == 0 || targetIndex == 1 || targetIndex == 2){
            return 1;
        }

        long[] targetArray = new long[targetIndex+1];
        targetArray[0] = 1;
        targetArray[1] = 1;
        targetArray[2] = 1;

        for (int i = 3; i < targetArray.length; i++) {
            targetArray[i] = targetArray[i-3] + targetArray[i-2];
        }
        return targetArray[targetIndex-1];
    }
}
