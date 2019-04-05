import java.util.Arrays;

public class Programmers {

    public static void main(String[] args) {
//        int[][] testcase1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//        int[][] testcase2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};//return ->[[22, 22, 11], [36, 28, 18], [29, 20, 14]
//        new Solution().solution(testcase1, testcase2);

        int[][] testcase1 = {{1,4}, {3,2}, {4,1}};
        int[][] testcase2 = {{3,3}, {3,3}};
        new Solution().solution(testcase1,testcase2);

    }
}


class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int result = 0;

        for (int k = 0; k < arr1.length; k++) {
            for (int i = 0; i < arr2[0].length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    result += arr1[k][j] * arr2[j][i];
                }
                answer[k][i] = result;
                System.out.println("result->" + result);
                result = 0;
            }
        }

        System.out.println(Arrays.deepToString(answer));

        return answer;
    }
}