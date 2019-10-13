import java.util.Arrays;

public class Programmers {

    public static void main(String[] args) {
        new Programmers().solution(new String[]{"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"});
    }

    //* 처음 만나면 아래로 한칸 두번재로 * 만나면 정지
    //# 아래로 한칸, > 오른쪽 한칸, < 왼쪽으로 한칸
    public int solution(String[] drum) {
        int answer = 0;

        int beadStartLine = drum.length;
        int beadDepth = drum.length;
        int starMeet = 0;

        String[][] beadMap = new String[drum.length][drum.length];
        for (int i = 0; i < drum.length; i++) {

            for (int j = 0; j < drum.length; j++) {

                beadMap[i][j] = String.valueOf(drum[i].charAt(j));
            }
        }

        System.out.println(Arrays.deepToString(beadMap));

        int i = 0;
        int j;
        for (int k = 0; k < beadStartLine; k++) {
            j = k;
            while (true) {
                //한칸내려가기
                if (beadMap[i][j].equals("#") ) {
                    i++;
                } else if (beadMap[i][j].equals(">")) {
                    j++;
                } else if (beadMap[i][j].equals("<")) {
                    j--;
                } else if (beadMap[i][j].equals("*")) {
                    starMeet++;
                    if (starMeet == 2){
                        break;
                    }else{
                        i++;
                    }

                }
                if (i >= beadDepth) {
                    answer++;
                    break;
                }
            }
            starMeet = 0;
            i = 0;

        }


        return answer;
    }

//    public static void main(String[] args) {
//        int[] arr = {2, 6, 8, 14};
//        new Solution().solution(arr); // return 168
//    }
//}
//
//class Solution {
//    public int solution(int[] arr) {
//        int answer = arr[0];
//        int max  = 0;
//        int min  = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            min = Math.min(answer, arr[i]);
//            max = Math.max(answer, arr[i]);
//
//            answer = (max*min) / gcd(max,min);
//        }
//        return answer;
//    }
//
//
//    int gcd(int max, int min){
//        int result = 0;
//
//        for (int i = 1 ; i <= min ; i++) {
//
//            if (min % i == 0 && max % i == 0){
//                result = i;
//            }
//        }
//        return result;
//    }
}
