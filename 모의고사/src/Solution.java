import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /*
    입력값 〉	[1, 2, 3, 4, 5]
    기댓값 〉	[1]
    입력값 〉	[1, 3, 2, 4, 2]
    기댓값 〉	[1, 2, 3]
    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5 /     1, 2, 3, 4, 5, ...
    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5 /     2, 1, 2, 3, 2, 4, 2, 5, ...
    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 /   3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
    */
    public static void main(String[] args) {
        new Solution().solution(new int[]{1, 2, 3, 4, 5});
//        new Solution().solution(new int[]{1, 3, 2, 4, 2});
    }

    public int[] solution(int[] answers) {
        int[] answer;
        int oneCorrectCount = 0;
        int twoCorrectCount = 0;
        int threeCorrectCount = 0;

        int[] oneAnswers = {1, 2, 3, 4, 5};
        int[] twoAnswers = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threeAnswers = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] correctArray = new int[3];
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == oneAnswers[i % 5]){
                oneCorrectCount++;
            }
            if (answers[i] == twoAnswers[i % 8]){
                twoCorrectCount++;
            }
            if (answers[i] == threeAnswers[i % 10]){
                threeCorrectCount++;
            }
        }

        correctArray[0] = oneCorrectCount;
        correctArray[1] = twoCorrectCount;
        correctArray[2] = threeCorrectCount;

        int max = correctArray[0];
        for (int i : correctArray) {
            if (max < i) {
                max = i;
            }
        }

        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (max == correctArray[i]){
                counter++;
                resultList.add(i+1);
            }
        }
        answer = new int[counter];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}

