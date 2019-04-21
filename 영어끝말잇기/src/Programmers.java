import java.util.*;

public class Programmers {

    public static void main(String[] args) {
//        String[] testcase = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//        new Solution().solution(5,testcase); // [0,0]
//
//        String[] testcase2 = {"hello", "one", "even", "never", "now", "world", "draw"};
//        new Solution().solution(2, testcase2); // [1,3]
//
        String[] testcase3 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        new Solution().solution(3, testcase3); // [3,3]

        String[] testcase4 = {"tank", "sex", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        new Solution().solution(2, testcase4); // [3,3]
    }
}

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String, Integer> checkList = new HashMap<>();
        checkList.put(words[0], 0);
        for(int i=0;i<words.length-1;i++){

            String x =words[i].substring(words[i].length()-1, words[i].length());
            String y = words[i+1].substring(0, 1);

            if(!x.equals(y) || checkList.containsKey(words[i+1])){

                if((i+2)%n==0){
                    answer[0] = n;
                    answer[1] = (i+2)/n;
                    return answer;
                }else{
                    answer[0] = (i+2)%n;
                    answer[1] =    ((i+2)/n)+1;
                    return answer;
                }

            }
            else{
                checkList.put(words[i+1], i+1);
                answer[0]=0;
                answer[1]=0;
            }
        }
        return answer;
    }
}
