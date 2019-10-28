import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> inputList = new ArrayList<>();

        String input = "";
        while (!input.equals(".")) {
            input = reader.readLine();
            inputList.add(input);
        }

        for (int i = 0; i < inputList.size()-1; i++) {
            writer.write(checkString(inputList.get(i)));
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }

    private static String checkString(String validString) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < validString.length(); i++) {
            if (validString.charAt(i) == '(' || validString.charAt(i) == '[')
                stack.push(validString.charAt(i));
            else if (validString.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    break;
                }
            } else if (validString.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    break;
                }
            }
            result = "yes";
        }

        return result;
    }
}
