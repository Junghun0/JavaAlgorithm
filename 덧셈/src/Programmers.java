import java.util.Arrays;

public class Programmers {

    public static void main(String[] args) {

        int[][] testcase = {{1, 2}, {2, 3}};
        int[][] testcase1 = {{3, 4}, {5, 6}};
        new Solution().solution(testcase, testcase1);

        int [][] test = {{1},{2}};
        int [][] test2 = {{3},{4}};
        new Solution().solution(test,test2);

    }
}


class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {

            for (int k = 0; k < arr1[i].length; k++) {

                answer[i][k] = arr1[i][k] + arr2[i][k];

            }
        }
        //System.out.println(Arrays.deepToString(answer));

        return answer;
    }
}