public class Programmers {

    public static void main(String[] args) {
        new Solution().solution(78); //->83
        //15 -> 23
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        int oneCount = findOneCount(n);
        int tmp = n;
        int result = 0;
        System.out.println(oneCount);

        while (result != oneCount){
            tmp++;
            result = findOneCount(tmp);
        }
        System.out.println(tmp);

        return answer;
    }


    int findOneCount(int n) {
        int oneCount = 0;
        String test = Integer.toBinaryString(n);

        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == '1') {
                oneCount++;
            }
        }
        return oneCount;
    }
}
