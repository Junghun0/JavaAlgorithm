public class Programmers {


    public static void main(String[] args) {

        int arr1 [] = {9, 20, 28, 18, 11};
        int arr2 [] = {30, 1, 21, 17, 28};


//        int arr1 [] = {46, 33, 33 ,22, 31, 50};
//        int arr2 [] = {27 ,56, 19, 14, 14, 10};
//        new Solution().solution(6, arr1, arr2);

        new Solution().solution(5, arr1, arr2);

        //return -> ["#####", "# # #", "### #", "#  ##", "#####"]
    }

    static String addZero(String num, int n) {
        String result = num;
        while (result.length() < n) {
            result = "0" + result;
        }
        return result;
    }

    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            int arrs_length = n;
            String [] map1 = new String[n];
            String [] map2 = new String[n];
            String [][] result_map = new String[n][n];
            StringBuilder sb = new StringBuilder();
            String [] answer = new String[n];


            for (int i = 0; i < arrs_length ; i++) {
                map1[i] = String.format("%0"+n+"d",Integer.parseInt(Integer.toBinaryString(arr1[i])));
                map2[i] = String.format("%0"+n+"d",Integer.parseInt(Integer.toBinaryString(arr2[i])));
            }

            for (int i = 0; i < n ; i++) {
                for (int j = 0 ; j < n ;j++){
                    if(map1[i].charAt(j) == '0' && map2[i].charAt(j) == '0'){
                        result_map[i][j] = " ";
                    }else if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1'){
                        result_map[i][j] = "#";
                    }else{
                        result_map[i][j] = "#";
                    }
                }
            }

            for (int k = 0; k < n; k++) {
                for (int j = 0 ; j < n ; j++){
                    sb.append(result_map[k][j]);
                }
                answer[k] = String.valueOf(sb);
                sb.setLength(0);
            }

//        String[] answer = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            answer[i] = addZero(Integer.toBinaryString(arr1[i] | arr2[i]), n)
//                    .replace("0", " ")
//                    .replace("1", "#");
//            System.out.println(answer[i]);
//        }


        return answer;
    }
    }
}
