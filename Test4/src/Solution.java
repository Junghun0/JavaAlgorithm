import java.util.Arrays;
import java.util.Collections;

public class Solution {

    /*
    입력값 〉	4, [4, 3, 3]
    기댓값 〉	12
    입력값 〉	1, [2, 1, 2]
    기댓값 〉	6
    입력값 〉	3, [1, 1]
    기댓값 〉	0
    */
    public static void main(String[] args) {
        new Solution().solution(4, new int[]{4, 3, 3});
    }

    public long solution(int n, int[] works) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            int mj = 0;

            for (int j = 0; j < works.length; j++) {
                if (max < works[j]) {
                    max = works[j];
                    mj = j;
                }
            }
            works[mj]--;
        }

        for (int i = 0; i < works.length; i++) {
            result += Math.pow(works[i],2);
        }

        return result;
    }

    public int calResult(Integer[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += Math.pow(data[i], 2);
        }
        return sum;
    }



}
