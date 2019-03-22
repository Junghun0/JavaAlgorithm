import java.util.Stack;

public class Programmers {

    public static void main(String[] args) {
        new Solution().solution("1S2D*3T");
    }

    static class Solution {
        public int solution(String dartResult) {
            int index = 0;
            int answer[] = new int[3];

            String numStr = "";
            for (char pointChr : dartResult.toCharArray()) {
                if (Character.isDigit(pointChr)) {
                    numStr += pointChr;
                } else {
                    if (!"".equals(numStr)) {
                        answer[index++] = Integer.parseInt(numStr);
                        numStr = "";
                    }

                    switch (pointChr) {
                        case 'S':
                            answer[index - 1] = (int) Math.pow(answer[index - 1], 1);
                            break;
                        case 'D':
                            answer[index - 1] = (int) Math.pow(answer[index - 1], 2);
                            break;
                        case 'T':
                            answer[index - 1] = (int) Math.pow(answer[index - 1], 3);
                            break;
                        case '*':
                            answer[index - 1] = answer[index - 1] * 2;
                            if (index - 2 >= 0) {
                                answer[index - 2] = answer[index - 2] * 2;
                            }
                            break;
                        case '#':
                            answer[index - 1] = answer[index - 1] * -1;
                            break;
                    }
                }
            }


            return answer[0] + answer[1] + answer[2];
        }
    }
}
