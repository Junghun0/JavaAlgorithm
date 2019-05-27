import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programmers {

    public static void main(String[] args) {
//        String[] testcase = {"Jane", "Kim"};
//        new Solution().solution(testcase);
        Scanner scanner = new Scanner(System.in);
        int kindCount = scanner.nextInt();
        int totalMoney = scanner.nextInt();
        int coin [] = new int[kindCount];
        int maxtmp = 0;
        int answer = 0;

        for (int i = 0; i < kindCount; i++) {
            coin[i] = scanner.nextInt();
            if (coin[i] <= totalMoney) maxtmp = i;
        }

        for (int i = maxtmp; i >= 0 ; i--) {
            answer += totalMoney / coin[i];
            totalMoney %= coin[i];
        }
        System.out.println(answer);
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
