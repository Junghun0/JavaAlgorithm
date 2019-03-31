import java.util.Arrays;

public class Programmers {

    public static void main(String[] args) {

        /*
        공백은 아무리 밀어도 공백입니다.
        s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
        s의 길이는 8000이하입니다.
        n은 1 이상, 25이하인 자연수입니다.
        */

        //new Solution().solution("AB",1);
        new Solution().solution("a B z", 4);

    }
}


class Solution {
    public String solution(String s, int n) {
        char[] result_arr = new char[s.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                result_arr[i] = (char) 32;
            } else {
                if (s.charAt(i) < 97) {//소문자
                    if (s.charAt(i) - 'A' + 65 + n > 90) {
                        int check = (s.charAt(i) - 'A' + 65 + n) - 90 - 1;
                        int result = 65 + check;
                        result_arr[i] = (char) result;
                    } else {
                        result_arr[i] = (char) (s.charAt(i) - 'A' + 65 + n);
                    }

                } else {//대문자
                    if (s.charAt(i) - 'a' + 97 + n > 122) {
                        int check = (s.charAt(i) - 'a' + 97 + n) - 122 - 1;
                        int result = 97 + check;
                        result_arr[i] = (char) (result);
                    } else {
                        result_arr[i] = (char) (s.charAt(i) - 'a' + 97 + n);
                    }
                }

            }

        }

        for (int i = 0; i < result_arr.length; i++) {
            sb.append(result_arr[i]);
        }

        return sb.toString();
    }
}
