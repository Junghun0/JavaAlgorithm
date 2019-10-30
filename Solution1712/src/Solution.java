import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        //1000 70 170

        String[] inputs = reader.readLine().split(" ");

        long basic = Long.parseLong(inputs[0]);
        long makeMoney = Long.parseLong(inputs[1]);
        long sellMoney = Long.parseLong(inputs[2]);

        long i = sellMoney - makeMoney; //한대 이득
        if (makeMoney >= sellMoney) {
            writer.write("-1");
        } else {
            writer.write((basic / i) + 1 +"");
        }
        writer.flush();
        writer.close();
    }
}
