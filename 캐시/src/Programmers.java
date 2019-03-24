import java.util.LinkedList;
import java.util.Queue;

public class Programmers {

    public static void main(String[] args) {
//        String[] test_case = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        new Solution().solution(3, test_case);

//        String[] test_case2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//        new Solution().solution(3,test_case2);

//        String[] test_case3  = {"Jeju", "Pangyo", "NewYork", "newyork"};
//        new Solution().solution(1,test_case3);

//        String[] test_case4 = {"Jeju", "Pangyo", "Seoul", "pangyo", "LA"};
//        new Solution().solution(2,test_case4);

        String[] test_case4 = {"Jeju", "Jeju", "Jeju", "Jeju", "Jeju"};
        new Solution().solution(1,test_case4);


    }


    static class Solution {
        public int solution(int cacheSize, String[] cities) {
            int cache_hit = 0;
            int cache_miss = 0;

            if (cacheSize == 0){
                cache_miss = 5 * (cities.length);
                return cache_miss;
            }

            String[] testcase = new String[cities.length];

            Queue<String> queue = new LinkedList<>();
            for (int k = 0; k < cities.length; k++) {

                testcase[k] = cities[k].toLowerCase();

            }


            for (int i = 0; i < cities.length; i++) {

                if (!queue.contains(testcase[i]) && queue.size() < cacheSize){
                    ((LinkedList<String>) queue).addLast(testcase[i]);
                    cache_hit += 5;

                }else if (!queue.contains(testcase[i]) && queue.size() == cacheSize){
                    ((LinkedList<String>) queue).removeFirst();
                    ((LinkedList<String>) queue).addLast(testcase[i]);
                    cache_hit += 5;

                }else if(queue.contains(testcase[i]) && queue.size() < cacheSize){
                    queue.remove(testcase[i]);
                    ((LinkedList<String>) queue).addLast(testcase[i]);
                    cache_miss += 1;

                } else if(queue.contains(testcase[i]) && queue.size() == cacheSize){//캐시안에 데이터가 있고, 꽉차있을때

                    int dupIdx = ((LinkedList<String>) queue).indexOf(testcase[i]);

                    ((LinkedList<String>) queue).remove(dupIdx);
                    ((LinkedList<String>) queue).addLast(testcase[i]);

                    cache_miss += 1;
                }else{

                }
            }

            System.out.println("result-> cache hit"+cache_hit+"cache miss->"+cache_miss);

            for (int i = 0; i < queue.size(); i++) {
                System.out.println(((LinkedList<String>) queue).get(i));
            }

            return cache_hit + cache_miss;
        }
    }
}
