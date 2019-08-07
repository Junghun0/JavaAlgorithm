import java.util.Arrays;

public class Solution {
    /*
    입력값 〉	[3, 1, 6, 2, 7, 30, 1]
    기댓값 〉	21
    */

    public static void main(String[] args) {
        solution(new int[]{3, 1, 6, 2, 7, 30, 1});
    }

    public static int solution(int[] weight) {
        int answer = 1;

        Arrays.sort(weight);

        for (int i = 0; i < weight.length; i++) {
            if (answer < weight[i]){
                break;
            }
            answer += weight[i];
        }
        return answer;
    }
}
