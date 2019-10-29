import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().split(" ");
        int up = Integer.parseInt(inputs[0]);//a 2
        int down = Integer.parseInt(inputs[1]);//b 1
        int top = Integer.parseInt(inputs[2]);//v 5

        double result = (top - up) / (double) (up - down);

        writer.write((int)Math.ceil(result + 1)+"");
        writer.flush();
        writer.close();
    }
}
