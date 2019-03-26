import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers {

    public static void main(String[] args) {

//        String [] testcase = {"08:00", "08:01", "08:02", "08:03"}; // -> 09:00
//        new Solution().solution(1,1,5,testcase);

//        String[] testcase2 = {"09:10", "09:09", "08:00"}; // -> 09:09
//        new Solution().solution(2, 10, 2, testcase2);

        String[] testcase3 = {"09:00", "09:00", "09:00", "09:00"};
        new Solution().solution(2,1,2,testcase3);

    }
}

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        //n - 운행횟수 t - 간격 m - 탈수잇는 수
        String answer = "";
        int[] busTime = new int[n];
        int[] userTime = new int[timetable.length];
        int startTime = 540;

        for (int i = 0; i < n; i++) {
            busTime[i] = startTime + t*i;
        }

        Arrays.sort(timetable);

        for (int k = 0; k < timetable.length; k++) {
            userTime[k] = getTime(timetable[k]);
        }

        int index = 0 ;
        int crewNum = 0 ;

        for (int i = 0; i < busTime.length; i++) {

            for (int k = index; k < userTime.length; k++) {

                if(busTime[i] >= userTime[k] && m > crewNum){
                    System.out.println(userTime[k]+"index"+index);
                    index++;
                    crewNum++;

                    if (i == busTime.length - 1 && k == userTime.length - 1 && m > crewNum){
                        answer = String.valueOf(busTime[n - 1]);
                        System.out.println(answer);
                    }
                }else{

                    if(i == busTime.length - 1 && index >= 1){
                        int tmp = userTime[index] - 1;
                        System.out.println(tmp);
                    }
                    break;

                }

            }
        }
        return answer;
    }

    public int getTime(String time){
        String[] userTime = time.split(":");


        return Integer.parseInt(userTime[0]) * 60 + Integer.parseInt(userTime[1]);
    }

}
