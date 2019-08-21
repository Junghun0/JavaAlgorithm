import java.util.*;

public class Programmers {

    public static void main(String[] args) {
        int[] testcase = {2, 1, 2, 6, 2, 4, 3, 3};
        new Solution().solution(5, testcase); //return -> 3, 4, 2, 1, 5

        int[] testcase2 = {4, 4, 4, 4, 4};
        new Solution().solution(4, testcase2);

        int[] testcase3 = {1};
        new Solution().solution(7, testcase3);

        int[] testcase4 = {6,6,6,6,6};
        new Solution().solution(5, testcase4);

    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Arrays.sort(stages);
        //실패율 같으면 낮은 스테이지부터
        // 1, 2, 2, 2, 3, 3, 4, 6
        //1-> 1/8 , 2-> 3/7 , 3-> 2/4 , 4-> 1/2 , 5-> 0
        //return 3,4,2,1,5
        List<Fail> failList = new ArrayList<>();
        List<Integer> stagesList = new ArrayList<>();

        for (int stage : stages){
            stagesList.add(stage);
        }

        int onUser;
        int index = 0;

        for (int j = 1; j < N + 1; j++) {
            onUser = 0;
            while (!stagesList.isEmpty()){
                if (j != stagesList.get(index)) {
                    break;
                }else if (j == stagesList.get(index)){
                    onUser++;
                    stagesList.remove(0);
                }
            }
            if (onUser == 0){
                failList.add(new Fail(j, (double)0));
            }else{
                failList.add(new Fail(j, ((double)onUser / (double)(stagesList.size() + onUser))));
            }
        }

        Collections.sort(failList);
        for (int i = 0; i < failList.size(); i++) {
            answer[i] = failList.get(i).stage;
        }
        System.out.println();

        return answer;
    }
}

class Fail implements Comparable<Fail>{
    public int stage;
    public double failRate;

    public Fail(int stage, double failRate) {
        this.stage = stage;
        this.failRate = failRate;
    }

    @Override
    public int compareTo(Fail o) {
        if (this.failRate < o.failRate){
            if (this.stage > o.stage){
                return 1;
            }
        }else if (this.failRate == o.failRate){
            if (this.stage > o.stage){
                return 1;
            }
        }
        return -1;
    }
}
