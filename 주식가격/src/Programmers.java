import java.util.*;

public class Programmers {

    public static void main(String[] args) {
        //int[] testcase = {1, 2, 3, 2, 3}; // -> 4,3,1,1,0

        int[] testcase = {1,3,4,5,67,2,4,3,2,4}; // -> 4,3,1,1,0
        new Solution().solution(testcase);
    }
}


class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];

        for(int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < length; j++){
                if(prices[i] > prices[j] || j == length - 1){
                    answer[i] = j - i;
                    break;
                }
            }
        }
        answer[length - 1] = 0;
        return answer;
    }
}