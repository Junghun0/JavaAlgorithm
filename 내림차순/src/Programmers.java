import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers {

    public static void main(String[] args) {
        new Solution().solution(118372);
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder stringBuilder = new StringBuilder();

        String test = String.valueOf(n);

        String[] numLength = test.split("");
        ArrayList<Long> sorting_list = new ArrayList<>();

        for (String s : numLength) {
            sorting_list.add(Long.parseLong(s));
        }

        Collections.sort(sorting_list);
        Collections.reverse(sorting_list);

        for (Long aLong : sorting_list) {
            stringBuilder.append(aLong);
        }
        answer = Long.parseLong(stringBuilder.toString());
        return answer;
    }
}


