import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    //[70, 50, 80, 50], 100 - > 3
    //[70, 80, 50], 100
    public static void main(String[] args) {
        new Solution().solution(new int[]{70, 50, 80, 50}, 100);
        new Solution().solution(new int[]{70, 80, 50}, 100);
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = people.length - 1;
        for(int i = 0; i <= index; i++, answer++)
            while(index > i && people[i] + people[index--] > limit)
                answer++;


        return answer;
    }
}
