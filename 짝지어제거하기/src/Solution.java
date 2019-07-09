import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
         new Solution().solution("baabaa"); //-> 1
        new Solution().solution("cdcd"); //-> 0
    }

    public int solution(String s) {
        int answer = 0;

        Stack<String> deleteStack = new Stack<>();
        deleteStack.push(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            if (deleteStack.isEmpty()){
                deleteStack.push(String.valueOf(s.charAt(i)));
            }else{
                if (deleteStack.peek().equals(String.valueOf(s.charAt(i)))){
                    deleteStack.pop();
                }else{
                    deleteStack.push(String.valueOf(s.charAt(i)));
                }
            }
        }


        if (deleteStack.isEmpty()){
            answer = 1;
        }else{
            answer = 0;
        }

        return answer;
    }
}
