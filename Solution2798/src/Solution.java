import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] conditionInput = reader.readLine().split(" ");
        int cardLength = Integer.parseInt(conditionInput[0]);
        int maxSum = Integer.parseInt(conditionInput[1]);
        int[] cardArray = new int[cardLength];
        String[] inputCards = reader.readLine().split(" ");

        for (int i = 0; i < cardLength; i++) {
            cardArray[i] = Integer.parseInt(inputCards[i]);
        }

        int tmp = 0;
        int sum;
        for (int i = 0; i < cardLength; i++) {
            for (int j = i + 1; j < cardLength; j++) {
                for (int k = j + 1; k < cardLength; k++) {
                    sum = cardArray[i] + cardArray[j] + cardArray[k];
                    if (tmp < sum && sum <= maxSum) {
                        tmp = sum;
                    }
                }
            }
        }

        writer.write(tmp+"");
        writer.flush();
        writer.close();
    }
}
