import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    /*
    입력값 〉	[["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]
    기댓값 〉	["ICN", "JFK", "HND", "IAD"]

    입력값 〉	[["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL", "SFO"]]
    기댓값 〉	["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
    * */
    public static void main(String[] args) {
        new Solution().solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}});
    }


    public String[] solution(String[][] tickets) {
        String[] answer = {};

        return answer;
    }
}
