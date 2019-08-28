import java.util.Arrays;

public class Solution {

    /*
    입력값 〉	[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
    기댓값 〉	30
    */

    public static void main(String[] args) {
        new Solution().solution(new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}});
    }

    public int solution(int[][] triangle) {
        int answer = 0;

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j == 0){
                    //왼쪽 끝에 있는 값들
                    triangle[i][j] += triangle[i-1][j];
                }else if (j == i){
                    //오른쪽 끝에 있는 값들
                    triangle[i][j] += triangle[i-1][j-1];
                }else{
                    //그외에는 더 큰값을 더해준다
                    triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
                }
            }
        }

        int max = triangle[triangle.length - 1][0];
        for (int i = 1; i < triangle[triangle.length-1].length; i++) {
            if (max < triangle[triangle.length - 1][i]){
                max = triangle[triangle.length - 1][i];
            }
        }
        answer = max;
        return answer;
    }

}
