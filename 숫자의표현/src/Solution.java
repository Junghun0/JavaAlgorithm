public class Solution {

    public static void main(String args[]) {
        /*
        1 + 2 + 3 + 4 + 5 = 15
        4 + 5 + 6 = 15
        7 + 8 = 15
        15 = 15
        연속된 자연수로 표현가능
        */
        new Solution().expressions(15);// return 4
    }

    public int expressions(int n) {
        int answer = 0;
        int sum = 0;
        int start = 1;

        while (start != n/2 + 1) {
            for (int i = start; i <= n/2 + 1 ; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                }
            }
            sum = 0;
            start++;
        }
        answer++;
        return answer;
    }
}
