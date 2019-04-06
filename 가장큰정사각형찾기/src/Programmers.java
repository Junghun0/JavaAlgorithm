import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
        //int[][] testcase = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};

        int[][] testcase2 = {{0, 0, 1, 1}, {1, 1, 1, 1}};
        new Solution().solution(testcase2); //return 9
    }
}

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int width;
        List<Integer> squareWidth = new ArrayList<>();
        List<Integer> squareWidthResult = new ArrayList<>();


        for (int[] ints : board) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 1) {
                    squareWidth.add(j);
                }
            }
            if (squareWidth.size() > 1) {
                width = squareWidth.get(squareWidth.size() - 1) - squareWidth.get(0) + 1;
                squareWidthResult.add(width);
                squareWidth.clear();
            } else {
                squareWidthResult.add(1);
                squareWidth.clear();
            }
        }

        System.out.println(squareWidthResult);

        Collections.sort(squareWidthResult);
        int index = 0;


        return (int)Math.pow(answer,2);
    }
}