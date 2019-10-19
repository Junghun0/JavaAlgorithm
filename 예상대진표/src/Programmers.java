import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Programmers {
    public static void main(String[] args) {
        new Solution().solution(8, 4, 7); //return 3
//        new Solution().solution(16, 2, 9); //return 3
    }
}

class Solution {
    // 1,2, 3,4, 5,6, 7,8, 9,10, 11,12, 13,14, 15,16 -> 16개, 8개
    // 1, 4,   5, 7,   10, 11,   13, 15              -> 8개 , 4개
    // 4,7, 10,13                                    -> 4개 , 2개

    // 1,2 ,3,4 ,5,6 ,7,8 -1 (  3 ,  6 )
    // 1 ,  4   , 5  , 7  -2 (  1 ,  3 )
    //  4      ,    7     -3 (  1 ,  2 )
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(a != b) {

            if (a%2 == 0){
                a /= 2;
            }else {
                a /= 2;
                a++;
            }

            if (b%2 == 0){
                b /= 2;
            }else{
                b /= 2;
                b++;
            }
            answer++;

        }
        return answer;
    }
}
