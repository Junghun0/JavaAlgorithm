import java.util.Arrays;
import java.util.regex.Pattern;

public class Solution2 {

    public static void main(String[] args) {
        solution(new String[]{"d@co@m.com","a@abc.com","b@def.com","c@ghi.net"});
        solution(new String[]{"abc.def@x.com","abc","abc@defx","abc@defx.xyz"});
    }

    public static int solution(String[] emails) {
        int result = 0;
        String[] topLevelDomainArr = { "com", "net", "org" };

        for (int i = 0; i < emails.length; i++) {

            String email = emails[i];
            String[] splitArr = email.split("@");

            if (splitArr.length != 2){
                continue;
            }
            boolean isName = Pattern.matches("[a-zA-Z.]*$", splitArr[0]);

            String[] splitDotArr = splitArr[1].split("\\.");

            if (isName && splitDotArr.length == 2) {
                boolean isTopLevelDomain = false;
                for (String domain : topLevelDomainArr) {
                    if (splitDotArr[1].equals(domain)) {
                        isTopLevelDomain = true;
                        break;
                    }
                }

                if(!isTopLevelDomain){
                    continue;
                }

                boolean isDomain = Pattern.matches("[a-zA-Z]*$", splitDotArr[0]);

                if (isDomain){
                    result++;
                }

            }
        }

        if (result == 0)
            result--;

        System.out.println(result);

        return result;

    }
}
