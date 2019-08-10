import java.util.Arrays;

public class Solution {
    /*
    입력값 〉	4, [4, 3, 3]
    기댓값 〉	12

    입력값 〉	1, [2, 1, 2]
    기댓값 〉	6

    입력값 〉	3, [1, 1]
    기댓값 〉	0
    * */

    public static void main(String[] args) {
        solution(4, new int[]{4, 3, 3});
        solution(1, new int[]{2, 1, 2});
        solution(3, new int[]{1, 1});
    }

    public static long solution(int n, int[] works) {
        long answer;

        int dayWork = 0;

        int[] dummyArr = works.clone();

        while (dayWork != n) {
            int deleteIndex = getMaxIndex(dummyArr);
            dummyArr[deleteIndex] -= 1;
            if (getArraySum(dummyArr)) {
                return 0;
            }
            dayWork++;
        }
        answer = getResult(dummyArr);
        return answer;
    }

    public static long getResult(int[] works) {
        long result = 0;
        for (int i = 0; i < works.length; i++) {
            result += Math.pow(works[i], 2);
        }
        return result;
    }

    public static int getMaxIndex(int[] works) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < works.length; i++) {
            if (max < works[i]) {
                max = works[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean getArraySum(int[] works) {
        int sum = 0;
        for (int work : works) {
            sum += work;
        }
        return sum == 0;
    }

}
