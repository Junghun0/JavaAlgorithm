import java.util.Scanner;

public class Programmers {

    public static void main(String[] args) {
        String[] testcase = {"Jane", "Kim"};
        new Solution().solution(testcase);
    }
}

class Solution {
    public String solution(String[] seoul) {
        final String answerStr = "김서방은 ";
        final String answerStr2 = "에 있다";
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                answer = answerStr + i+ answerStr2;
            }
        }
        return answer;
    }
}
