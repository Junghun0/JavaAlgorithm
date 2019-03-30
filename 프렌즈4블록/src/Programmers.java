import java.util.ArrayList;
import java.util.Arrays;

public class Programmers {

    public static void main(String[] args) {
//        String[] testcase = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
//        new Solution().solution(4,5, testcase); // -> return 14

        String[] testcase2 = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        new Solution().solution(6,6,testcase2); // -> return 15
    }


}

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        String[][] kakaoArr = new String[m][n];
        ArrayList<int[]> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m  ; k++) {
                kakaoArr[k][i] = String.valueOf(board[k].charAt(i));
            }
        }

        System.out.println(Arrays.deepToString(kakaoArr));

        int index = 1;
        for (int i = 0; i < kakaoArr.length; i++) {

            for (int k = 1; k < kakaoArr[i].length; k++) {

            }
            index++;
            System.out.println();

        }

        return answer;
    }
}
