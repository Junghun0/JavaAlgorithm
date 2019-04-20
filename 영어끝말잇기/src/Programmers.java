import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
//        String[] testcase = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//        new Solution().solution(5,testcase); // [0,0]
//
//        String[] testcase2 = {"hello", "one", "even", "never", "now", "world", "draw"};
//        new Solution().solution(2, testcase2); // [1,3]
//
        String[] testcase3 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        new Solution().solution(3,testcase3); // [3,3]

        String[] testcase4 = {"tank", "sex", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        new Solution().solution(2,testcase4); // [3,3]
    }
}

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        List<String> wordList = new ArrayList<>();
        int nextWordsIndex = 1;
        int playerLength = 1;
        int resultGameTurn = 1;
        int playerIndex = 1;

        for (int i = 0; i < words.length - 1; i++) {
            wordList.add(words[i]);
            if (words[i].charAt(words[i].length() - 1) - 'a' == words[nextWordsIndex].charAt(0) - 'a' && !wordList.contains(words[nextWordsIndex])){
                playerLength++;
                playerIndex++;
                if (playerLength%n == 0){
                    resultGameTurn++;
                    playerIndex = 1;
                }
            }else if (wordList.contains(words[nextWordsIndex])){//이미 사용된 단어!
                return new int[]{playerIndex,resultGameTurn};
            }else if (words[i].charAt(words[i].length() - 1) - 'a' != words[nextWordsIndex].charAt(0) - 'a'){
                return new int[]{playerIndex,resultGameTurn};
            }
            nextWordsIndex++;
        }
        return new int[]{0,0};
    }
}
