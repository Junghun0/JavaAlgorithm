public class Programmers {

    public static void main(String[] args) {

        //new Solution().solution(2,5);
        new Solution().solution(4,3);

    }
}

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];


        for(int i=0;i<n;i++){
            answer[i] = (x*(i+1));
        }

        return answer;

    }
}
