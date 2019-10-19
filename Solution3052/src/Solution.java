import java.io.*;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> remainderSet = new HashSet<>();

        int remainder;
        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(reader.readLine());
            remainder = input % 42;
            remainderSet.add(remainder);
        }

        writer.write(remainderSet.size()+"");
        writer.flush();
        writer.close();
    }
}
