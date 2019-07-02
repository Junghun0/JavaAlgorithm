public class Programmers {

    public static void main(String[] args) {
//        String[] testcase = {"Jane", "Kim"};
//        new Solution().solution(testcase);
        new Solution().solution("PM 01:00:00","AM 01:00:00"); //-> 12:00:00
        new Solution().solution("AM 00:00:01","AM 00:00:02"); //-> 00:00:01
        new Solution().solution("AM 00:00:02","AM 00:00:01");
        new Solution().solution("AM 04:00:02","PM 04:00:01");
    }
}


class Solution {
    public String solution(String start, String end) {
        String answer = "";
        String startAMPM = start.substring(0,2);
        String endAMPM = end.substring(0,2);

        String startTime = start.substring(3, start.length());
        String endTime = end.substring(3, end.length());

        String[] startTimeArray = startTime.split(":");
        String[] endTimeArray = endTime.split(":");

        int startSecond = hourToSecond(Integer.parseInt(startTimeArray[0]),Integer.parseInt(startTimeArray[1]),Integer.parseInt(startTimeArray[2]));
        int endSecond = hourToSecond(Integer.parseInt(endTimeArray[0]), Integer.parseInt(endTimeArray[1]),Integer.parseInt(endTimeArray[2]));

        if (startAMPM.equals(endAMPM)){
            answer = secondToAnswer(endSecond - startSecond);
        }else{
            answer = secondToAnswer((endSecond + 43200) - startSecond);
        }
        System.out.println(answer);
        return answer;
    }

    public static String secondToAnswer(int second){
        return String.format("%02d:%02d:%02d",second/3600,second%3600 / 60,second % 3600 % 60);
    }

    public static int hourToSecond(int hour, int min, int second){
        int hourToSecond = hour * 60 * 60;
        int minToSecond = min * 60;
        return hourToSecond + minToSecond + second;
    }
}
//
//class Solution {
//    public String solution(String[] seoul) {
//        final String answerStr = "김서방은 ";
//        final String answerStr2 = "에 있다";
//        String answer = "";
//        for (int i = 0; i < seoul.length; i++) {
//            if (seoul[i].equals("Kim")){
//                answer = answerStr + i+ answerStr2;
//            }
//        }
//        return answer;
//    }
//}
