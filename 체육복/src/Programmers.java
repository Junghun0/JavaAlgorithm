

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};
//        new Solution().solution(5, lost, reserve);

//        int[] lost = {1, 3, 4, 5};
//        int[] reserve = {1, 4};
//        new Solution().solution(6, lost, reserve);

        int[] lost = {12, 13, 16, 17, 19, 20, 21, 22};
        int[] reserve = {1,22, 16, 18, 9, 10};
        new Solution().solution(24, lost, reserve);

//        int[] lost = {2, 4};
//        int[] reserve = {3};
//        new Solution().solution(5, lost, reserve); //return -> 4

//        int[] lost = {3};
//        int[] reserve = {1};
//        new Solution().solution(3, lost, reserve);
    }
}


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //다 1로 초기화 하고 reserve 는 +1 하고 lost 는 -1 하고
        int answer = 0;
        int[] studentNum = new int[n];

        Arrays.fill(studentNum, 1);
        System.out.println(Arrays.toString(studentNum));

        for (int j = 0; j < reserve.length; j++) {
            studentNum[reserve[j] - 1] += 1;
        }

        System.out.println(Arrays.toString(studentNum));

        for (int i = 0; i < lost.length; i++) {
            studentNum[lost[i] - 1] -= 1;
        }

        System.out.println(Arrays.toString(studentNum));

        for (int i = 1; i < studentNum.length; i++) {
            if (studentNum[i-1] == 2 && studentNum[i] == 0 && i < studentNum.length - 1){
                studentNum[i] += 1;
                studentNum[i-1] -= 1;
            }

            if (studentNum[i] == 2 && studentNum[i-1] == 0){
                studentNum[i-1] += 1;
                studentNum[i] -= 1;
            }
        }

        for (int i = 0; i < studentNum.length; i++) {
            if (studentNum[i] != 0){
                answer++;
            }
        }

        System.out.println(Arrays.toString(studentNum));
        System.out.println(answer);


        return answer;
    }
}
