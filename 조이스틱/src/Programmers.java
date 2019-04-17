import java.util.Arrays;

public class Programmers {

    public static void main(String[] args) {
//        new Solution().solution("JEROEN"); //return 56
//        new Solution().solution("JAN"); //return 23
//        new Solution().solution("JAZ"); // return 11
//        new Solution().solution("ABBDEC"); // return 16
//        new Solution().solution("BAAAB"); // return 6
        new Solution().solution("ABABAAAAAAABA "); // return 10
    }
}

class Solution {
    public int solution(String name) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int nameLength = name.length();

        for (int i = 0; i < nameLength; i++) {
            sb.append("A");
        }
        System.out.println(sb.toString());

        int[] compareArray = new int[nameLength];
        Arrays.fill(compareArray, 0);
        int[] indexArray = new int[nameLength];
        for (int i = 0; i < indexArray.length; i++) {
            indexArray[i] = name.charAt(i) - 'A';
        }

        int sum = 0;
        for (int i = 0; i < indexArray.length; i++) {
            sum += indexArray[i];
            if (indexArray[i] > 13) {
                indexArray[i] = 25 - indexArray[i] + 1;
            }
        }
        if (sum == 0) {
            return 0;
        } else {
            int zeroCount = 0;
            int index = 0;
            while (!Arrays.equals(compareArray, indexArray)) {
                if (indexArray[index] == compareArray[index]) {
                    if (indexArray[index] == 0) {
                        if (index != 0){
                            zeroCount++;
                        }
                        index++;
                        answer++;
                    } else {
                        index++;
                        answer++;
                    }
                } else {
                    if (indexArray[index] == 0) {
                        index++;
                        zeroCount++;
                    } else {//0이 아닐떄
                        compareArray[index] += 1;
                        answer++;
                    }
                }
                System.out.println(Arrays.toString(compareArray));
            }
            answer = answer - zeroCount;
            System.out.println(answer);
        }
        return answer;
    }
}
