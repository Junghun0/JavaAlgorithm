import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().split(" ");
        int up = Integer.parseInt(inputs[0]);//a 2
        int down = Integer.parseInt(inputs[1]);//b 1
        int top = Integer.parseInt(inputs[2]);//v 5

        int temp = top - up;
        int day = temp / (up - down);

        if (temp % (up - down) != 0) {
            day++;
        }

        writer.write(day+"");
        writer.flush();
        writer.close();
    }
}
