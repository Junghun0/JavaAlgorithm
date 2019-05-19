import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
        int[] testcase = {1, 2, 3, 9, 10, 12};
        new Solution().solution(testcase, 7); //return ->2
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int[] heapArray = new int[scoville.length + 1];

        heapArray[0] = 0;
        int idx = 1;

        for (int i = scoville.length - 1; i >= 0 ; i--) {
            heapArray[idx] = scoville[i];
            idx++;
        }
        System.out.println(Arrays.toString(heapArray));

        
        return answer;
    }
}
