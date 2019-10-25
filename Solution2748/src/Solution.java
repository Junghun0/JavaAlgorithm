import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(reader.readLine());

        long[] fibonacci = new long[input + 1];
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        writer.write(fibonacci[input]+"");
        writer.flush();
        writer.close();
    }
}
