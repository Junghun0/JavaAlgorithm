import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        new Solution().solution(new String[]{"d@co@m.com","a@abc.com","b@def.com","c@ghi.net"});
    }

    public int solution(String[] emails){
        int answer = 0;
        String[] topLevelDomains = { "com", "net", "org" };
        for (int i = 0; i < emails.length; i++) {

            String email = emails[i];
            String[] strs = email.split("@");

            if (strs.length != 2)
                continue;

            boolean isName = Pattern.matches("[a-zA-Z.]$", strs[0]);

            String[] strs2 = strs[1].split("\\.");

            if (isName && strs2.length == 2) {

                boolean isDomain = Pattern.matches("[a-zA-Z]$", strs2[0]);
                boolean isTopLevelDomain = false;
                for (int j = 0; j < 3; j++) {
                    if (strs2[1].equals(topLevelDomains[j]))
                        isTopLevelDomain = true;
                }

                if (isDomain && isTopLevelDomain)
                    answer++;

            }
        }

        if (answer == 0)
            answer--;

        return answer;
    }
}

/*
       String[] topLevelDomains = { "com", "net", "org" };

        int result = 0;

        for (int i = 0; i < emails.length; i++) {

            String email = emails[i];
            String[] strs = email.split("@");

            if (strs.length != 2)
                continue;

            boolean isName = Pattern.matches("[a-zA-Z.]$", strs[0]);

            String[] strs2 = strs[1].split("\.");

            if (isName && strs2.length == 2) {

                boolean isDomain = Pattern.matches("[a-zA-Z]$", strs2[0]);
                boolean isTopLevelDomain = false;
                for (int j = 0; j < 3; j++) {
                    if (strs2[1].equals(topLevelDomains[j]))
                        isTopLevelDomain = true;
                }

                if (isDomain && isTopLevelDomain)
                    result++;

            }
        }

        if (result == 0)
            result--;

        return result;
* */