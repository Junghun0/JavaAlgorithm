import java.util.Arrays;
import java.util.Stack;

public class Solution {
    /*
    입력값 〉	3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]
    기댓값 〉	2

    입력값 〉	3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]
    기댓값 〉	1
    */

    public static void main(String[] args) {
//        new Solution().solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
//        new Solution().solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});
//        new Solution().solution(4, new int[][]{{1, 0, 0, 1}, {0, 1, 1, 1}, {0, 1, 1, 0}, {1, 1, 0, 1}});
//        new Solution().solution(5, new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});
//        new Solution().solution(4, new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}});
        new Solution().solution(3, new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}});
    }


    static boolean[][] link;

    public void dfs(int[][] computers, int idx, int n) {
        for (int i = 0; i < n; i++) {
            if (computers[idx][i] == 1 && !link[idx][i]) {
                link[idx][i] = link[i][idx] = true;
                dfs(computers, i, n);
            }
        }
    }

//    public int solution(int n, int[][] computers) {
//        int answer = 0;
//        link = new boolean[n][n];
//
//        for (int i = 0; i < n; i++) {
//            if (!link[i][i]) {
//                dfs(computers, i, n);
//                answer++;
//            }
//        }
//        return answer;
//    }

    public int solution(int n, int[][] computers){
        Stack<Integer> stk = new Stack<Integer>();
        boolean[] b = new boolean[n];
        int ret = 0;

        for(int i = 0; i < n; i++){
            if(b[i]) continue;

            ret++;
            stk.push(i);
            boolean flag = true;
            b[i] = true;

            while(!stk.isEmpty()){
                flag = true;
                int cur = stk.peek();

                for(int j = 0; j < n; j++){
                    if(b[j] || computers[cur][j] == 0) continue;

                    flag = false;
                    stk.push(j);
                    b[j] = true;
                    break;
                }

                if(flag) stk.pop();
            }
        }
        return ret;
    }


}
