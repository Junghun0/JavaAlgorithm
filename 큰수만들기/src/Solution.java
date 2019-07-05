import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //"4177252841", 4 => "775841"
        new Solution().solution("4177252841", 4);
    }

    public String solution(String number, int k) {
        String answer = "";
        char[] result = new char[number.length() - k];

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char num = number.charAt(i);
            if (!stack.isEmpty() && stack.peek() < num && k-- > 0){
                stack.pop();
            }
            stack.push(num);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return new String(result);
    }
}
