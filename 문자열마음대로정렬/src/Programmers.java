import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
//        String[] testcase = {"sun", "bed", "car"};// return -> ["car", "bed", "sun"]
//        new Solution().solution(testcase,1);
        String[] testcase2 = {"abce", "abcd", "cdx"};
        new Kotlin_Solution().solution(testcase2,1);


//        new Solution().solution(testcase2, 1);
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        return answer;
    }
}
