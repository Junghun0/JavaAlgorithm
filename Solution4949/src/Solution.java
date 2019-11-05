import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int flag = 0;
        while(flag == 0) {
            String line = br.readLine();
            if(line.equals(".")) break;
            boolean isValid = true;
            Stack<Character> stack = new Stack<Character>();
            for(int i = 0; i < line.length(); i++){
                char c = line.charAt(i);
                if(c == '(' || c == '['){
                    stack.add(c);
                } else if(c == ')'){
                    if(!stack.empty() && stack.pop() == '(') continue;
                    else {
                        isValid = false;
                        break;
                    }
                } else if(c == ']') {
                    if(!stack.empty() && stack.pop() == '[') continue;
                    else {
                        isValid = false;
                        break;
                    }
                }
            }
            if(isValid && stack.isEmpty()) bw.write("yes\n");
            else bw.write("no\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
