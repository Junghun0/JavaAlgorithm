public class Programmers {

    public static void main(String[] args) {

        new Solution().solution(626331);
//        new Solution().solution(6);
//        new Solution().solution(16);

    }
}

class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;

        while(num != 1){
            count++;
            if (num % 2 == 0){
                num = num/2;
            }else if (num%2 == 1){
                num = (num*3) + 1;
            }

            if (num == 1){
                answer = count;
            }

            if (count > 500 && num != 1){
                return -1;
            }
        }
        return answer;
    }
}


