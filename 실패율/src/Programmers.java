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
        int onStageUserCount = 0;
        while (!stageUserList.isEmpty()){

            if (stageUserList.get(index) == stageCheck){
                onStageUserCount++;
                stageUserList.remove(0);
            }else {
                stageUserList.remove(0);
                index = 0;
                stageCheck++;
            }

            System.out.println("onstageUsercount-> "+onStageUserCount + " stageCheck-> "+stageCheck + " List size-> "+stageUserList.size()+" onStageUserCount-> "+onStageUserCount);
        }


        return answer;
    }

    private double makeFailrate(double under, double up){
        return Double.parseDouble(String.format("%.3f",up/under));
    }
}

class Fail implements Comparable<Fail>{
    public int stage;
    public double failRate;

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public double getFailRate() {
        return failRate;
    }

    public void setFailRate(double failRate) {
        this.failRate = failRate;
    }

    @Override
    public int compareTo(Fail o) {
        if (this.stage == o.stage){
            if (this.failRate < o.failRate){
                return -1;
            }
        }else{
            if (this.failRate < o.failRate){
                return -1;
            }
        }
        return -1;
    }
}