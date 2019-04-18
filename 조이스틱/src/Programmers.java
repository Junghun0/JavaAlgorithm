import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
        new Solution().solution("JEROEN"); //return 56
        new Solution().solution("JAN"); //return 23
        new Solution().solution("JBZ"); // return 11
//        new Solution().solution("ABBDEC"); // return 16
//        new Solution().solution("BAAAB"); // return 6
//        new Solution().solution("ABABAAAAAAABA"); // return 10
    }
}

class Solution {
    public int solution(String name) {
        int answer = 0;
        int nameLength = name.length();

        int[] compareArray = new int[nameLength];
        Arrays.fill(compareArray, 0);

        int[] indexArray = new int[nameLength];
        for (int i = 0; i < indexArray.length; i++) {
            indexArray[i] = name.charAt(i) - 'A';
        }

        for (int i = 0; i < indexArray.length; i++) {
            if (indexArray[i] > 13) {
                indexArray[i] = 25 - indexArray[i] + 1;
            }
        }

        int index = 0;
        while (!Arrays.equals(indexArray, compareArray)){

            if (indexArray[index] != compareArray[index]){
                compareArray[index]++;
                answer++;
            }else if (indexArray[index] == compareArray[index]){
                index++;
                answer++;
            }

            System.out.println(Arrays.toString(compareArray));
        }


        return answer;
    }
}
