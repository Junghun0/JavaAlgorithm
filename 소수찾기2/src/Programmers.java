import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers {

    public static void main(String[] args) {
        //new Solution().solution("17"); //return 3

        new Solution().solution("011"); //return 2

    }
}


class Solution {
    public int solution(String numbers) {
        int answer = 0;
        List<Integer> nums = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        List<Integer> compareList;

        String[] a = numbers.split("");// 7, 17 ,71

        for (int i = 0; i < a.length; i++) {
            nums.add(Integer.valueOf(a[i]));
        }

        Collections.sort(nums);

        for (int i = 0; i < nums.size(); i++) {
            number.add(nums.get(i));
            System.out.println(nums.get(i));
            for (int j = 1; j < nums.size() + 1; j++) {
                if (i != j) {
                    System.out.println("d"+Integer.valueOf(a[j] + a[i]));
                    number.add(Integer.valueOf(a[j] + a[i]));
                }
            }
        }

        Collections.sort(number);
        compareList = findNum(number.get(number.size() - 1));

        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < compareList.size(); j++) {
                if (compareList.get(j) == number.get(i)){
                    answer++;
                }
            }
        }

        return answer;
    }


    ArrayList<Integer> findNum(int n) {

        ArrayList<Integer> answer = new ArrayList<>();

        int[] numArr = new int[n + 2];

        for (int i = 2; i <= n; i++) {
            numArr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (numArr[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= n; j += i) {
                numArr[j] = 0;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (numArr[i] != 0) {
                answer.add(numArr[i]);
            }
        }
        return answer;
    }
}