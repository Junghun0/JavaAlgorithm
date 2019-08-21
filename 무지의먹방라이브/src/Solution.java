import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /*
        입력값 〉	[3, 1, 2], 5
        기댓값 〉	1
        */
        new Solution().solution(new int[]{3, 1, 2}, 5);

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

        //5 나누기 배열길이 = 1 .. 2 (모두 1씩 빼고 -> 2,0,2 두번째 까지먹음 즉 마지막 )
        //몫 -> 배열길이만큼 루프 돌고 / 나머지만큼 빼기 시작 ( 0 체크하면서 ) 그다음 순서 출력 끝

        long minusTime = (k / food_times.length);
        long lastTime = (k % food_times.length);
        boolean[] checkZeroArr = new boolean[food_times.length];

        System.out.println("lastTime " + lastTime);

        //몫 -> 배열길이만큼 루프 돌기
        for (int i = 0; i < food_times.length; i++) {
            if (food_times[i] != 0) {
                food_times[i] -= minusTime;
            } else {
                checkZeroArr[i] = true;
            }
        }
        System.out.println("루프만큼 돌기 " + Arrays.toString(food_times));
        int result = 0;

        //나머지 -> 나머지만큼 0번째 부터 루프 돌기

        if (lastTime == 0) {
            int aa = 0;
            for (int i = 0; i < food_times.length; i++) {
                if (food_times[i] != 0) {
                    aa = i;
                    break;
                }
            }
            result = aa + 1;
            answer = result;
        } else {

            for (int i = 0; i < lastTime; i++) {

                if (food_times[i] == 0) {
                    //0번째 부터 나머지만큼 0일때
                    result = (i + 1) + 1;
                } else {
                    //0아님
                    result = (i + 1);
                }

            }

            if (result + 1 >= food_times.length) {
                result = (result) % food_times.length;
            }

            answer = result + 1;
        }

        System.out.println(answer);
        return answer;
    }

}
