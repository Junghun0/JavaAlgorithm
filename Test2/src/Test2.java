import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        /*
        [1, 4, 2], [5, 4, 4]
        기댓값 〉	29

       	[1, 2], [3, 4]
        기댓값 〉	10
        */

//        new Solution().solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});

        /*
        입력값 〉	3, ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
        기댓값 〉	[3, 3]

        입력값 〉 5, ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
        기댓값 〉	[0, 0]

        입력값 〉	2, ["hello", "one", "even", "never", "now", "world", "draw"]
        기댓값 〉	[1, 3]
        */
        new Solution2().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        new Solution2().solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        new Solution2().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
    }

    static class Solution2 {
        List<String> wordsList = new ArrayList<>();
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            int loopCount = 1;
            int userIndex = 1;
            boolean flag = true;

            Collections.addAll(wordsList, words);

            for (int i = 1; i < words.length; i++) {
                userIndex++;
                if (userIndex == n+1){
                    loopCount++;
                    userIndex = 1;
                }

                if (checkValid(wordsList.get(i-1),wordsList.get(i)) && checkDuplicate(wordsList, wordsList.get(i), i)){
                }else{
                    flag = false;
                    answer[0] = userIndex;
                    answer[1] = loopCount;
                }
            }

            if (flag){
                answer[0] = 0;
                answer[1] = 0;
            }

            System.out.println(Arrays.toString(answer));
            return answer;
        }

        public boolean checkDuplicate(List<String> wordsList, String word, int index){
            for (int i = 0; i < index; i++) {
                if (wordsList.get(i).equals(word)){
                    return false;
                }
            }
            return true;
        }

        //끝말잇기 성립체크
        public boolean checkValid(String front, String back){
            char frontWord = front.charAt(front.length() - 1);
            char backWord = back.charAt(0);
            return frontWord == backWord;
        }
    }

    static class Solution {
        public int solution(int[] A, int[] B) {
            int answer;
            int[] sumArray = new int[A.length];
            int length = A.length;
            int index = A.length - 1;

            Arrays.sort(A);
            Arrays.sort(B);

            for (int i = 0; i < length; i++) {
                int min = A[i];
                int max = B[index];
                sumArray[i] = min * max;
                index--;
            }
            answer = getSum(sumArray);

            return answer;
        }

        public int getSum(int[] data) {
            int sum = 0;
            for (int datum : data) {
                sum += datum;
            }
            return sum;
        }
    }
}
