public class Programmers {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        new Solution().solution(arr); // return 168
    }
}

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int max  = 0;
        int min  = 0;

        for (int i = 0; i < arr.length; i++) {

            min = Math.min(answer, arr[i]);
            max = Math.max(answer, arr[i]);

            answer = (max*min) / gcd(max,min);
        }
        return answer;
    }


    int gcd(int max, int min){
        int result = 0;

        for (int i = 1 ; i <= min ; i++) {

            if (min % i == 0 && max % i == 0){
                result = i;
            }
        }
        return result;
    }
}
