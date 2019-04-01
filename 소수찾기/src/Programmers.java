public class Programmers {

    public static void main(String[] args) {
        new Solution().solution(10);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] numArr = new int[n+2];


        for (int i = 2; i <= n; i++) {
            numArr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (numArr[i] == 0){
                continue;
            }
            for (int j = i+i; j <= n ; j+=i) {
                numArr[j] = 0;
            }
        }

        for (int i = 2; i <= n ; i++) {
            if (numArr[i] != 0){
                answer++;
            }
        }

        return answer;
    }
}
