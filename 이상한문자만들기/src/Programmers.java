public class Programmers {

    public static void main(String[] args) {
        new Solution().solution("try hello worlds");

        new Solution().solution("try hello world strys");

        new Solution().solution("   try hello world strys try t");

        new Solution().solution("AAAAAAAAAAA A    A A A AAAAA AAA");
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String answer2;

        StringBuffer sb = new StringBuffer();
        String upper = "";
        String lower = "";

        String[] sub_data = s.split(" ");

        for (int i = 0; i < sub_data.length; i++) {
            for (int j = 0; j < sub_data[i].length(); j++) {
                if (j == 0) {
                    String.valueOf(sub_data[i].charAt(0)).toUpperCase();
                }
                if (j % 2 == 0) {
                    upper = String.valueOf(sub_data[i].charAt(j)).toUpperCase();
                    sb.append(upper);
                } else {
                    lower = String.valueOf(sub_data[i].charAt(j)).toLowerCase();
                    sb.append(lower);
                }
            }
            sb.append(" ");
        }

        answer2 = sb.toString().substring(0, sb.toString().length() - 1);

        answer = answer2;

        System.out.println(answer2);


        return answer;
    }
}
