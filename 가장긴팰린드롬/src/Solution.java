public class Solution {

    /*
    입력값 〉	"abcdcba"
    기댓값 〉	7

    입력값 〉	"abacde"
    기댓값 〉	3
    * */
    public static void main(String[] args) {
        new Solution().solution("abcdcba"); // abcdcba -> abcdcba 7
//        new Solution().solution("abacde"); // abacde -> aba 3
        //aabaace
    }

    public int solution(String s) {
        int max_len = 1;
        int temp_len = 1;
        int len = s.length();
        // 팰린드롬 길이가 짝수일 경우
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) { // 짝수 문자열에서 팰린드롬 기준점 선출
                temp_len = 0;
                for (int j = i + 1; j < len; j++) {
                    try {
                        char left = s.charAt(i + 1 - j + i); // left 위치선정
                        char right = s.charAt(j);

                        if (left == right) {
                            temp_len += 2;
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        break;
                    }
                }
            }
            if (max_len < temp_len) {
                max_len = temp_len;
            }
        }

        for (int i = 0; i < len - 1; i++) {
            temp_len = 1;
            for (int j = i - 1; j >= 0; j--) {
                try {
                    char left = s.charAt(j);
                    char right = s.charAt(i + i - j); // right 위치선정

                    if (left == right) {
                        temp_len += 2;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    break;
                }
            }
            if (max_len < temp_len) {
                max_len = temp_len;
            }
        }

        return max_len;

    }


}
