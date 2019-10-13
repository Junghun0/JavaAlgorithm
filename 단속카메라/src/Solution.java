public class Solution {

    /*
    입력값 〉	[[-20, 15], [-14, -5], [-18, -13], [-5, -3]]
    기댓값 〉	2
    */
    public static void main(String[] args) {
        new Solution().solution(new int[][]{{-20, -15},{-14, -5}, {-18, -13}, {-5,-3}}); //2
    }

    public int solution(int[][] routes) {
        int answer = 0;
        int carLenght = routes.length;
        int cameraCount = 0;

        int start = routes[0][0];
        int end = routes[0][1];

        for (int i = 1; i < carLenght; i++) {
            if (start < routes[i][0] || end > routes[i][1]){
                start = routes[i][0];
                end = routes[i][1];
                cameraCount++;
            }
        }
        answer = cameraCount;
        return answer;
    }
}
