import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    /*
    입력값 〉	[3, 1, 2, 3]
    기댓값 〉	2

    입력값 〉	[3, 3, 3, 2, 2, 4]
    기댓값 〉	3

    입력값 〉	[3, 3, 3, 2, 2, 2]
    기댓값 〉	2
    */
    public static void main(String[] args) {
        new Solution().solution(new int[]{1,2,1,1,1,1,1,3});
        new Solution().solution(new int[]{1,2,3,4,5,6,7,8});
        new Solution().solution(new int[]{1, 1});
        new Solution().solution(new int[]{1,1,1,1});
        new Solution().solution(new int[]{4, 1, 2, 3});
        new Solution().solution(new int[]{3, 3, 3, 2, 2, 4});
        new Solution().solution(new int[]{3, 3, 3, 2, 2, 2});
        new Solution().solution(new int[]{3, 3, 3, 3, 3, 2});
    }

    public int solution(int[] nums) {
        int canTakeNum = nums.length / 2;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        int hashSize = hashSet.size();

        if (hashSize > canTakeNum){
            return canTakeNum;
        }
        return hashSize;
    }
}
