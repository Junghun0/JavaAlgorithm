import java.util.ArrayList;

public class Programmers {

    public static void main(String[] args) {
        int[] testcase = {4, 3, 2, 1};
        new Solution().solution(testcase);

    }
}

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> data = new ArrayList<>();

        int min = arr[0];
        for (int i2 : arr) {
            if (min > i2) {
                min = i2;
            }
        }

        for (int i1 : arr) {
            data.add(i1);
        }

        int minIndex = data.indexOf(min);
        data.remove(minIndex);
        int[] answer = new int[data.size()];
        if (!data.isEmpty()){
            for (int i = 0; i < data.size(); i++) {
                answer[i] = data.get(i);
            }
        }else{
            return new int[]{-1};
        }
        return answer;
    }
}