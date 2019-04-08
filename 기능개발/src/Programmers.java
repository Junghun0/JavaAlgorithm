import java.util.*;

public class Programmers {

    public static void main(String[] args) {
        int[] progress = {93, 30, 55};
        int[] speed = {1, 30, 5};

        new Solution().solution(progress, speed); // return -> [2,1]
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int len = progresses.length;

        int num = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len) {
                q.add(num);
                break;
            }
            if (progresses[i] >= 100) {
                num++;
                continue;
            }
            if (num != 0) {
                q.add(num);
            }

            num = 0;
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            if (remain % speeds[i] != 0) {
                day++;
            }

            for (int j = i; j < len; j++) {
                progresses[j] += (day * speeds[j]);
            }
            num++;
        }

        int[] answer = new int[q.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = q.remove();
        }
        return answer;
    }
}
