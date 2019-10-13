import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        new Solution().solution(5); // 8
        new Solution().solution(4); // 5
        new Solution().solution(3); // 3
        new Solution().solution(30);
    }

    public long solution(int n) {
        long answer;
        answer = findStep(n+1);
        System.out.println(answer);
        if (answer >= 1234567){
            answer = answer % 1234567;
        }
        return answer;
    }

    public long findStep(int step){
        long[] temp = new long[step+1];
        if (step <= 2){
            return 1;
        }
        if (temp[step] != 0){
            return temp[step];
        }else{
            temp[step] = findStep(step - 1) + findStep(step - 2);
            return temp[step];
        }
    }
}
