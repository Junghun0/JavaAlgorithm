import java.io.*;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int dataSize = Integer.parseInt(reader.readLine());

        Stack<Integer> numStack = new Stack<>();

        for (int i = 0; i < dataSize; i++) {
            int inputNums = Integer.parseInt(reader.readLine());
            if (inputNums != 0){
                numStack.push(inputNums);
            } else{
                numStack.pop();
            }
        }

        System.out.println(numStack);

        int sum = 0;
        for (int i = 0; i < numStack.size(); i++) {
            System.out.println(numStack.peek());
//            sum += numStack.peek();
            numStack.pop();
        }

        System.out.println(sum);

    }
}
