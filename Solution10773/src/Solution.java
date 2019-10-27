import java.io.*;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int dataSize = Integer.parseInt(reader.readLine());

        Stack<Integer> numStack = new Stack<>();

        for (int i = 0; i < dataSize; i++) {
            int inputNums = Integer.parseInt(reader.readLine());
            if (inputNums != 0) {
                numStack.push(inputNums);
            } else {
                numStack.pop();
            }
        }

        int sum = 0;
        for (Integer integer : numStack) {
            sum += integer;
        }
        writer.write(sum + "");
        writer.flush();
        writer.close();
    }
}
