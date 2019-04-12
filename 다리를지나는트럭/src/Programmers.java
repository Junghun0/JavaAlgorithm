import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Programmers {

    public static void main(String[] args) {
        int[] weight = {7, 4, 5, 6};
        new Solution().solution(2, 10, weight);//return ->8
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalTime = 1;
        int index = 1;

        List<Integer> bridgeList = new ArrayList<>();
        bridgeList.add(truck_weights[0]);

        while (bridgeList.isEmpty()) {
            
            if (bridgeList.get(index - 1) + truck_weights[index] > weight) {
                bridgeList.remove(index - 1);
                bridgeList.add(index, truck_weights[index - 1]);
            }


        }


        return answer;
    }
}