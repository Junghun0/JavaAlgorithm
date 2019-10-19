import java.util.ArrayList;
import java.util.Arrays;

public class Programmers {

    public static void main(String[] args) {
        int[][] testcase = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
        //질문한 숫자 , 스트라이크 , 볼  324, 328
        new Programmers().solution(testcase); //return -> 2

    }

    public int solution(int[][] baseball) {
        int answer = 0;

        int questionNum = baseball.length;

        for (int i = 0; i < questionNum; i++) {
            //0,0 1,0 2,0
            findScore(baseball[i][0], baseball[i][1]);
        }

        return answer;
    }

    private boolean validNum(int targetNum, int findNum) {

        return true;
    }

    private boolean findScore(int targetNum, int strikeNum) {
        int hun = targetNum/100;
        int ten = (targetNum%100) / 10;
        int one = targetNum % 10;
        return true;
    }
}

