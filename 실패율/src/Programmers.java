import java.util.*;

public class Programmers {

    public static void main(String[] args) {
        int[] testcase = {2, 1, 2, 6, 2, 4, 3, 3};
        new Solution().solution(5, testcase); //return -> 3, 4, 2, 1, 5

        int[] testcase2 = {4, 4, 4, 4, 4};
        new Solution().solution(4, testcase2);

    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Arrays.sort(stages);
        System.out.println(Arrays.toString(stages));
        //1-> 8/1  2-> 7/3  3-> 4/2 4-> 2/1 5-> 0

        List<Integer> stageUserList = new ArrayList<>();
        for (int onStage : stages){
            stageUserList.add(onStage);
        }

        int stageCheck = 1;
        int index = 0;
        while (!stageUserList.isEmpty()){


        }


        return answer;
    }
}