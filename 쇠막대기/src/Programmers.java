import java.util.Stack;

public class Programmers {

    public static void main(String[] args) {
        new Solution().solution("()(((()())(())()))(())");
    }
}

class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        int index = 0;

        String[] barArray = arrangement.split("");

        Stack<String> stringStack = new Stack<>();
        stringStack.push(barArray[0]);


        for (int i = 1; i < barArray.length; i++) {
            if (barArray[i - 1].equals("(") && barArray[i].equals(")")) {
                index++;
                stringStack.pop();
                answer += stringStack.size();
                System.out.println(index+"번째레이저");
            } else if (barArray[i].equals("(")) {
                stringStack.push(barArray[i]);
            }else{
                if (stringStack.peek().equals("(")){
                    stringStack.pop();
                    answer++;
                }
            }
            System.out.println(stringStack);
        }
        System.out.println("answer->"+answer);

        return answer;
    }
}
