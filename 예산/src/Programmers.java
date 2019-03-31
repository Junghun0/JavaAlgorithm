import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers {

    public static void main(String[] args) {
        int[] testcase = {1,3,2,5,4};
        new Solution().solution(testcase,9); //return ->3
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0 ;

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget){
                answer = i;
                break;
            }
        }

        if (sum <= budget){
            answer = d.length;
        }
        return answer;
    }
}
