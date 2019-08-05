import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    /*
    입력값 〉	["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"]
    기댓값 〉	[333, -45]

    입력값 〉	["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]
    기댓값 〉	[0, 0]

    I -> 숫자삽입
    D 1 -> 최대값 삭제
    D -1 -> 최솟값 삭제
    * */
    public static void main(String[] args) {
//        solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
        solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});

    }

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            String[] tmpString = operations[i].split(" ");

            if (tmpString[0].equals("I")) {
                numList.add(Integer.parseInt(tmpString[1]));
            } else if (tmpString[0].equals("D")) {
                if (Integer.parseInt(tmpString[1]) == 1 && !numList.isEmpty()) {
                    //최대값 삭제
                    numList.remove(Collections.max(numList));
                } else if (Integer.parseInt(tmpString[1]) == -1 && !numList.isEmpty()) {
                    //최대값 삽입
                    numList.remove(Collections.min(numList));
                }
            }
        }

        if (numList.isEmpty()){
            return answer;
        }else{
            answer[0] = Collections.max(numList);
            answer[1] = Collections.min(numList);
        }

        return answer;
    }
}
