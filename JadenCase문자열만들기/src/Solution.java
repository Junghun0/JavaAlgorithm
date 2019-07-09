public class Solution {
    /*
    입력값 〉	"3people unFollowed me"
    기댓값 〉	"3people Unfollowed Me"
    */
    public static void main(String[] args) {
        new Solution().solution("3people unFollowed    me");
        new Solution().solution("for the last week");
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String lowerCaseStr = s.toLowerCase().trim();
        System.out.println(lowerCaseStr);
        String[] wordArray = lowerCaseStr.split("\\s+");
        for(int i = 0 ; i < wordArray.length ; i++){
            System.out.println(wordArray[i]);
            sb.append(makeJadenStr(wordArray[i]));
            if (i < wordArray.length - 1){
                sb.append(" ");
            }
        }
        System.out.println("answer ->  "+sb.toString().trim());
        return sb.toString();
    }

    public String makeJadenStr(String word){
        StringBuilder sb = new StringBuilder();
        char firstChar = word.charAt(0);
        if (firstChar > 48 && firstChar < 59){
            return word;
        }else{
            String lastWord = "";
            char transfer = (char)(word.charAt(0) - 32);
            if (word.length() == 1){
                char result = (char)(word.charAt(0) - 32);
                sb.append(result);
                return sb.toString();
            }

            if (word.length() < 3){
                lastWord = word.substring(1);
            }else{
                lastWord = word.substring(1,word.length());
            }
            sb.append(transfer);
            sb.append(lastWord);
            return sb.toString();
        }
    }
}
