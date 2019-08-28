import java.util.*;

public class Programmers {

    public static void main(String[] args) {
        //n - 운행횟수 t - 간격 m - 탈수잇는 수 09:00 부터 시작
        /*
        입력값 〉	1, 1, 5, ["08:00", "08:01", "08:02", "08:03"]
        기댓값 〉	"09:00"

        입력값 〉	2, 10, 2, ["09:10", "09:09", "08:00"]
        기댓값 〉	"09:09"

        입력값 〉	2, 1, 2, ["09:00", "09:00", "09:00", "09:00"]
        기댓값 〉	"08:59"

        입력값 〉	1, 1, 5, ["00:01", "00:01", "00:01", "00:01", "00:01"]
        기댓값 〉	"00:00"

        입력값 〉	1, 1, 1, ["23:59"]
        기댓값 〉	"09:00"

        입력값 〉	10, 60, 45, ["23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"]
        기댓값 〉	"18:00"
        */

//        String [] testcase = {"08:00", "08:01", "08:02", "08:03"}; // -> 09:00
//        new Solution().solution(1,1,5,testcase);

        String[] testcase2 = {"09:10", "09:09", "08:00"}; // -> 09:09
        new Solution().solution(2, 10, 2, testcase2);

//        String[] testcase3 = {"09:00", "09:00", "09:00", "09:00"};
//        new Solution().solution(2,1,2,testcase3);

    }
}

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        //n - 운행횟수 t - 간격 m - 탈수잇는 수
        String answer = "";
        Arrays.sort(timetable);

        return answer;
    }

    public int getTime(String time){
        String[] userTime = time.split(":");
        return Integer.parseInt(userTime[0]) * 60 + Integer.parseInt(userTime[1]);
    }

}
