public class Programmers {

    public static void main(String[] args) {

        new Solution().solution(10);

    }
}

class Solution {
    public boolean solution(int x) {
        String[] numLength = String.valueOf(x).split("");
        int length = numLength.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += Integer.valueOf(numLength[i]);
        }

        if (x % sum == 0){
            return true;
        }else{
            return false;
        }
    }
}
