import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //"4177252841", 4 => "775841"
//        입력값 〉	"1924", 2
//        기댓값 〉	"94"
//        입력값 〉	"1231234", 3
//        기댓값 〉	"3234"

//        new Solution().solution("4177252841", 4);
//        new Solution().solution("1924", 2);
//        new Solution().solution("1231234", 3);
//        new Solution().solution("111111",5);
//        new Solution().solution("143920",3);
        new Solution().solution("1277322314",5);

    }

    public String solution(String number, int k) {
        String answer = "";
        String[] stringArr = new String[number.length()];
        for (int i = 0; i < number.length(); i++) {
            stringArr[i] = String.valueOf(number.charAt(i));
        }
        System.out.println(Arrays.toString(stringArr));

        Arrays.sort(stringArr, (o1, o2) -> {
            if (Integer.parseInt(o1) > Integer.parseInt(o2)){
                return 1;
            }
            return -1;
        });
        System.out.println(Arrays.toString(stringArr));
        return answer;
    }

    private int makeNum(Stack<Character> stack, int length){
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = stack.get(i);
        }
        return Integer.parseInt(new String(result));
    }


    private int makeNum2(Stack<Character> stack, int length){
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = stack.get(i+1);
        }
        return Integer.parseInt(new String(result));
    }
}
