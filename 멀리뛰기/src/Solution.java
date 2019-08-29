import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        new Solution().solution(5); // 8
        new Solution().solution(4); // 5
        new Solution().solution(3); // 3
        new Solution().solution(200);
    }

    public long solution(int n) {
        long answer;
        answer = findStep(n);
        System.out.println(answer);
        if (answer >= 1234567){
            answer = answer % 1234567;
        }
        return answer;
    }

    public long findStep(int step){
        long last1, last2, result = 0;

        if(step <= 1)
            return 1;

        last1 = 1;
        last2 = 1;

        for(long i=1; i < step; i++) {
            result = last1 + last2;
            last1 = last2;
            last2 = result;
        }

        return result;
    }
}
