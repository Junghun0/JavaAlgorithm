import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
        int[][] testcase = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        int[][] testcase2 = {{0, 0, 1, 1}, {1, 1, 1, 1}};
        new Solution().solution(testcase); //return 9
        new Solution().solution(testcase2); //return 4
    }
}

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        /*
        {0, 1, 1, 1}
        {1, 1, 1, 1}
        {1, 1, 1, 1}
        {0, 0, 1, 0}
         */

        /*
        {0, 0, 1, 1}
        {1, 1, 1, 1}
        */

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] >= 1 && board[i][j - 1] >= 1 && board[i - 1][j - 1] >= 1 && board[i - 1][j] >= 1) {
                    board[i][j] = Math.min(board[i][j - 1], Math.min(board[i - 1][j - 1], board[i - 1][j])) + 1;
                }
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                answer = Math.max(board[i][j], answer);
            }
        }

        return answer*answer;
    }
}