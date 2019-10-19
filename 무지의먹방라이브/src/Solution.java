import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /*
        입력값 〉	[3, 1, 2], 5
        기댓값 〉	1
        */
        new Solution().solution(new int[]{3, 1, 2}, 6);

        new Solution().solution(new int[]{6, 2, 3}, 4);

        new Solution().solution(new int[]{1, 2, 3}, 3);


//        0~1초 동안에 1번 음식을 섭취한다. 남은 시간은 [2,1,2] 이다.
//        1~2초 동안 2번 음식을 섭취한다. 남은 시간은 [2,0,2] 이다.
//        2~3초 동안 3번 음식을 섭취한다. 남은 시간은 [2,0,1] 이다.
//        3~4초 동안 1번 음식을 섭취한다. 남은 시간은 [1,0,1] 이다.
//        4~5초 동안 (2번 음식은 다 먹었으므로) 3번 음식을 섭취한다. 남은 시간은 [1,0,0] 이다.
//        5초에서 네트워크 장애가 발생했다. 1번 음식을 섭취해야 할 때 중단되었으므로, 장애 복구 후에 1번 음식부터 다시 먹기 시작하면 된다.
    }

    public int solution(int[] food_times, long k) {
        int answer = 0;

        int countLoop = (int)k / food_times.length;//1 .. 2

        int eatCount = 0;
        int index = 0;

        for (int i = 0; i < countLoop * food_times.length; i++) {
            int indexLoop = i % food_times.length ;
            if (food_times[indexLoop] == 0 && indexLoop != food_times.length - 1) {
                food_times[indexLoop + 1]--;
            }else if (food_times[indexLoop] == 0){
                food_times[0]--;
            }else {
                food_times[indexLoop]--;
            }

//            if (food_times[i-1] != 0) {
//                food_times[i-1]--;
//            }else{//0이면
//                System.out.println("zero");
//            }
        }

        System.out.println(Arrays.toString(food_times));



        return answer;
    }

}
