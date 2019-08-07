import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    /*
    입력값 〉	[[0, 3], [1, 9], [2, 6]]
    기댓값 〉	9
    */

    public static void main(String[] args) {
        solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
    }

    public static int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Work> priorityQueue = new PriorityQueue<>();
        List<Work> workList = new ArrayList<>();
        //우선순위 큐
        // 0 - 3
        //   1 - 9
        //     2 - 6
        for (int i = 0; i < jobs.length; i++) {
            priorityQueue.add(new Work(jobs[i][0], jobs[i][1]));
        }

        for (int i = 0; i < jobs.length; i++) {
            workList.add(priorityQueue.poll());
        }

        for (int i = 0; i < workList.size(); i++) {
            System.out.println(workList.get(i).waitTime + " , " + workList.get(i).workTime);
        }

        int time = 0;
        int sum = 0;
        while (workList.size() > 0) {
            for (int i = 0; i < workList.size(); i++) {

                if (time >= workList.get(i).waitTime) {
                    time += workList.get(i).workTime;
                    sum += time - workList.get(i).waitTime;
                    workList.remove(i);
                    break;
                }
                if (i == workList.size() - 1) time++;
            }
        }

        answer = (sum / jobs.length);

        return answer;
    }

    static class Work implements Comparable<Work> {
        private int waitTime;
        private int workTime;

        public Work(int waitTime, int workTime) {
            this.waitTime = waitTime;
            this.workTime = workTime;
        }

        @Override
        public int compareTo(Work work) {
            if (this.workTime < work.workTime) return -1;
            else if (this.workTime == work.workTime) {
                if (this.waitTime < work.waitTime) return -1;
                else return 1;
            } else return 1;
        }
    }
}
