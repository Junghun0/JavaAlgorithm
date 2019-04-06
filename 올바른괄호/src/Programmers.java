import java.util.Stack;

public class Programmers {

    public static void main(String[] args) {
        new Solution().solution("(())()");
    }
}

class Solution {
    boolean solution(String s) {
            boolean answer = true;
            int check = 0;

            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '(') check += 1;
                else check -= 1;
                if(check < 0) return false;
            }

            if(check != 0) return false;
            return answer;

        /*Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if (stack.peek().equals(")")) {
                    stack.push(s.charAt(i));
                } else {
                    stack.push(s.charAt(i));
                }
            }

            System.out.println(stack);
        }

        return stack.isEmpty();*/
    }
}
