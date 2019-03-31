import java.util.ArrayList;
import java.util.Collections;

public class Programmers {

    public static void main(String[] args) {
        new Solution().solution("Zbcdefg");
    }
}

class Solution {
    public String solution(String s) {
        ArrayList<Integer> lowerList = new ArrayList<>();
        ArrayList<Integer> upperList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) < 97){ 
                upperList.add(s.charAt(i) - 'A' + 65);
            }else{
                lowerList.add(s.charAt(i) - 'a' + 97);
            }
        }

        Collections.sort(lowerList);
        Collections.sort(upperList);

        for (int i = lowerList.size() - 1; i >= 0; i--) {
            sb.append((char)(lowerList.get(i) - 'a' + 97));

        }
        for (int i = upperList.size() - 1; i >= 0 ; i--) {
            sb.append((char)(upperList.get(i) - 'A' + 65));
        }

        return sb.toString();
    }
}