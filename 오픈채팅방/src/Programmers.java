import java.util.*;

public class Programmers {

    public static void main(String[] args) {
        String[] testcase = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        new Solution().solution(testcase); // return "Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."
    }
}

class Solution {
    public String[] solution(String[] record) {
        final String LOG_ENTER = "님이 들어왔습니다.";
        final String LOG_LEAVE = "님이 나갔습니다.";
        Map<String, String> userlogMap = new HashMap<>();
        List<String[]> resultLogList = new LinkedList<>();

        for (String records : record) {
            String[] keyWord = records.split(" ");
            if (keyWord[0].equals("Enter")) {
                userlogMap.put(keyWord[1], keyWord[2]);
                resultLogList.add(keyWord);
            } else if (keyWord[0].equals("Change")) {
                userlogMap.put(keyWord[1], keyWord[2]);
            } else {
                resultLogList.add(keyWord);
            }
        }

        String[] answer = new String[resultLogList.size()];
        int idx = 0;
        for (String[] keyWords : resultLogList) {
            String nickName = userlogMap.get(keyWords[1]);
            if (keyWords[0].equals("Enter"))
                answer[idx++] = nickName + LOG_ENTER;
            else
                answer[idx++] = nickName + LOG_LEAVE;
        }
        return answer;
    }
}