public class Programmers {

    public static void main(String[] args) {
        new Solution().solution("01033334444");
    }
}

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();

        int lastIndex = phone_number.length();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }

        sb.append(phone_number.substring(lastIndex-4,lastIndex));

        return sb.toString();
    }
}
