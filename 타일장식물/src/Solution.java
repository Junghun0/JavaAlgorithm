import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        // 1 -> 4  1
        // 2 -> 6  1,1
        // 3 -> 10  1,1,2
        // 4 -> 16  1,1,2,3
        // 5 -> 26  1,1,2,3,5 ( 5 * 4 + 3 + 2 + 1 )
        new Solution().solution(5);
//        new Solution().solution(6);
//        new Solution().solution(7);
//        new Solution().solution(8);
        // 6 -> 42  1,1,2,3,5,8 ( 8 * 4 + 5 + 3 + 2 )
        //          1,1,2,3,5,8,13 ( 13 * 4 + 8 + 5 + 3 )
        //1,1,2,3,5,8,13,21,34,56
    }

    public long solution(int N) {
        long[] fibonacci = new long[N + 1];
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        return round(N, fibonacci);
    }

    public long round(int N, long[] fibonacci) {
        return fibonacci[N] * 4 + fibonacci[N - 1] * 2;
    }
}
