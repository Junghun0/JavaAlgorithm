import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        int one = num2 % 10;
        int two = (num2 % 100) / 10;
        int three = num2 / 100;

        writer.write(num1 * one + "");
        writer.newLine();
        writer.write(num1 * two + "");
        writer.newLine();
        writer.write(num1 * three +"");
        writer.newLine();
        writer.write(num1 * num2 +"");
        writer.flush();
        writer.close();
    }

}
