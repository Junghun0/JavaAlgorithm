import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseLength = Integer.parseInt(reader.readLine());
        int[] inputs = new int[testCaseLength];

        for (int i = 0; i < testCaseLength; i++) {
            inputs[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(inputs);

        int result2 = inputs[inputs.length / 2];
        int result4 = inputs[inputs.length - 1] - inputs[0];

        System.out.println(findResult1(inputs));
        System.out.println(result2);
        System.out.println(findResult3(inputs));
        System.out.println(result4);

        /*
        산술평균 : N개의 수들의 합을 N으로 나눈 값
        중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        최빈값 : N개의 수들 중 가장 많이 나타나는 값
        범위 : N개의 수들 중 최댓값과 최솟값의 차이 */
    }

    private static int findResult3(int[] data) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (hashMap.containsKey(data[i])) {
                int mCount = hashMap.get(data[i]) + 1;
                hashMap.put(data[i], mCount);
            } else {
                hashMap.put(data[i], 1);
            }
        }


        return 0;
    }

    private static int findResult1(int[] inputs) {
        int sum = 0;
        double result;
        for (int input : inputs) {
            sum += input;
        }
        result = sum / (double)inputs.length;
        return (int)Math.round(result);
    }
}
