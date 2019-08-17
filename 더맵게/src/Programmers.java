import java.util.*;

public class Programmers {

    public static void main(String[] args) {
        int[] testcase = {1, 2, 3, 9, 10, 12};
        int[] testcase2 = {3, 5, 1, 2, 7, 6};
//        new Solution().solution(testcase, 7); //return ->2
//        new Solution().solution(testcase2, 30);

        new Solution().solution2(testcase2,7);
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int answer;

        List<Integer> scovilleList = new ArrayList<>();

        for (int k : scoville) {
            scovilleList.add(k);
        }

        Collections.sort(scovilleList);

        int scovilleValue;
        int resultCount = 0;


        while (!checkValid(scovilleList, K)) {

            if (scovilleList.get(0) < K) {
                int first = scovilleList.get(0);
                int second = scovilleList.get(1);

                scovilleValue = first + (second * 2);

                removeValues(scovilleList);
                scovilleList.add(0, scovilleValue);
                resultCount++;

                if (scovilleList.size() == 1 && scovilleList.get(0) < K){
                    resultCount = -1;
                    break;
                }
            }
        }

        answer = resultCount;
        return answer;
    }

    public void removeValues(List<Integer> list) {
        list.remove(0);
        list.remove(0);
        for (int i = 0; i < 2; i++) {
            list.remove(0);
        }
    }

    public boolean checkValid(List<Integer> list, int k) {
        Collections.sort(list);
        if (list.get(0) > k) {
            return true;
        }
        return false;
    }

    public int solution2(int[] scoville, int K) {
        int answer = 0 ;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int a : scoville){
            priorityQueue.add(a);
        }

        System.out.println(priorityQueue);

        return answer;
    }
}
