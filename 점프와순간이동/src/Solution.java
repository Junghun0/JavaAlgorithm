public class Solution {

    //k칸 이동 -> 소모량 + 1
    //순간이동 -> 현재위치 * 2 위치로 이동
    public static void main(String[] args) {
        new Solution().solution(5);//2
        new Solution().solution(6);//2
        new Solution().solution(5000);//5
    }

    public int solution(int n) {
        int ans = 0;
        int useBattery = 0;

        while(n != 0){
            if (n % 2 == 0){
                n = n/2;
            }else{
                n = n -1;
                useBattery++;
            }
        }
        ans = useBattery;
        return ans;
    }
}
