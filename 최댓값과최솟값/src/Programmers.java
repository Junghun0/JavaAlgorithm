import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
        //new Solution().solution("1 2 3 4 -1");
        new Solution().solution("-1 -2 -3 -4");
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String numString = s.replaceAll(" ","");
        List<Integer> num = new ArrayList<>();
        String[] numbers = s.split(" ");

        System.out.println(numString);
        for (String number : numbers) {
            num.add(Integer.valueOf(number));
        }
        System.out.println(num);
        Collections.sort(num);

        sb.append(num.get(0));
        sb.append(" ");
        sb.append(num.get(num.size() - 1));
        System.out.println(sb.toString());
        return sb.toString();
    }
}
